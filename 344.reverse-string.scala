/*
 * @lc app=leetcode id=344 lang=scala
 *
 * [344] Reverse String
 */

// @lc code=start
object Solution {
    def reverseString(s: Array[Char]): Unit = {
        (0 until s.length / 2).foreach { i =>
            val buffer = s(s.length - 1 - i)
            s(s.length - 1 - i) = s(i)
            s(i) = buffer
        }
    }
}
// @lc code=end
