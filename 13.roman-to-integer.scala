/*
 * @lc app=leetcode id=13 lang=scala
 *
 * [13] Roman to Integer
 */

// @lc code=start
object Solution {
    def romanToInt(s: String): Int = {
        val dict = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50,
                        'C' -> 100, 'D' -> 500, 'M' -> 1000)
        val ns = s.toList.map(dict)
        var sum = 0
        var i = 0
        while (i < ns.length) {
            if (i + 1 < ns.length && ns(i + 1) > ns(i)) {
                sum += ns(i + 1) - ns(i)
                i += 2
            }
            else {
                sum += ns(i)
                i += 1
            }
        }
        sum
    }
}
// @lc code=end
