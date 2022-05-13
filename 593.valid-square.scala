/*
 * @lc app=leetcode id=593 lang=scala
 *
 * [593] Valid Square
 */

// @lc code=start
object Solution {
    def validSquare(p1: Array[Int], p2: Array[Int], p3: Array[Int], p4: Array[Int]): Boolean = {
        val points = List(p1, p2, p3, p4)
        val distances = points
            .combinations(2)
            .collect { case List(a, b) =>
                val dx = a(0) - b(0)
                val dy = a(1) - b(1)
                dx * dx + dy * dy
            }
            .toList
            .sorted

        val (sides, diagonals) = distances.splitAt(4)

        sides
            .combinations(2)
            .forall {
                case List(a, b) => a == b & a > 0
                case _ => false
            } && (diagonals(0) == diagonals(1))

    }
}
// @lc code=end
