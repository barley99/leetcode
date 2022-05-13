/*
 * @lc app=leetcode id=682 lang=scala
 *
 * [682] Baseball Game
 */

// @lc code=start
object Solution {
    def record(op: String, records: List[Int]): List[Int] = op match {
        case "C" => records.drop(1)
        case "D" => records.head * 2 :: records
        case "+" => records.take(2).sum :: records
        case score => score.toInt :: records
    }

    def calPoints(ops: Array[String]): Int = {
        val OpsIndexMax = ops.length
        def scan(opsIndex: Int, records: List[Int]): List[Int] =
            if (opsIndex >= OpsIndexMax) records
            else scan(opsIndex + 1, record(ops(opsIndex), records))
        scan(0, Nil).reverse.sum
    }
}
// @lc code=end
