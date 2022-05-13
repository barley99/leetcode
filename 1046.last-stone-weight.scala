/*
 * @lc app=leetcode id=1046 lang=scala
 *
 * [1046] Last Stone Weight
 */

// @lc code=start
object Solution {
    def lastStoneWeight(stones: Array[Int]): Int = {
        if (stones.length == 1) stones.head
        else {
        val stonesOrdered = stones.sorted(Ordering.Reverse)
        val (pair, rest) = stonesOrdered.splitAt(2)
    }
}
}

// @lc code=end
