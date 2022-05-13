/*
 * @lc app=leetcode id=59 lang=scala
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
object Solution {
    def square(n: Int, shift: Int): Array[(Int, Int)] = {
        if (n <= 0) Array.empty[(Int, Int)]
        else {
            val idsTop = (0 until n).map((0, _))
            val idsRight = (1 until n).map((_, n - 1))
            val idsBottom = (n - 2 to 0 by -1).map((n - 1, _))
            val idsLeft = (n - 2 to 1 by -1).map((_, 0))
            val sides = idsTop ++ idsRight ++ idsBottom ++ idsLeft
            sides
                .map { case (a, b) => (a + shift, b + shift) }
                .toArray ++ square(n - 2, shift + 1)
        }
    }

    def generateMatrix(n: Int): Array[Array[Int]] = {
        val result = Array.fill(n)(Array.fill(n)(0))

        square(n, 0)
            .zipWithIndex
            .foreach { case ((i, j), index) => result(i)(j) = index + 1 }

        result
    }
}
// @lc code=end
