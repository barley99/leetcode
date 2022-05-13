/*
 * @lc app=leetcode id=1137 lang=scala
 *
 * [1137] N-th Tribonacci Number
 */

// @lc code=start
object Solution {
    def tribonacci(n: Int): Int = {
        if (n == 0) 0
        else if (n == 1 || n == 2) 1
        else (2 until n).foldLeft((0, 1, 1)) { case ((a, b, c), _) => (b, c, a + b + c) }._3
    }
}
// @lc code=end
