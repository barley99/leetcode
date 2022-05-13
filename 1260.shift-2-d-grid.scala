/*
 * @lc app=leetcode id=1260 lang=scala
 *
 * [1260] Shift 2D Grid
 */

// @lc code=start
object Solution {
    def shiftGrid(grid: Array[Array[Int]], k: Int): List[List[Int]] = {
        val width = grid(0).size
        val size = grid.size * width

        val xs = grid.flatten
        val (tail, head) = xs.splitAt(size - k % size)

        head
            .foldRight(tail.toList)(_ :: _)
            .grouped(width)
            .toList
    }
}
// @lc code=end
