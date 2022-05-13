/*
 * @lc app=leetcode id=70 lang=scala
 *
 * [70] Climbing Stairs
 */

// @lc code=start
object Solution {
    def climbStairs(n: Int): Int = {
        val (a, b) = (1 until n).foldLeft((0, 1)){ case ((a, b), _) => (b, a + b) }
        a + b
    }
}
// @lc code=end
