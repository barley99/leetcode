/*
 * @lc app=leetcode id=844 lang=scala
 *
 * [844] Backspace String Compare
 */

// @lc code=start
object Solution {
    def compact(s: String): String =
        s.foldLeft(List.empty[Char]) {
            case (acc, '#') => acc.drop(1)
            case (acc, elem) => elem :: acc
        }.mkString

    def backspaceCompare(s: String, t: String): Boolean = {
        compact(s) == compact(t)
    }
}
// @lc code=end
