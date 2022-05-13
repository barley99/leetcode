/*
 * @lc app=leetcode id=289 lang=scala
 *
 * [289] Game of Life
 */

// @lc code=start
object Solution {
    def gameOfLife(board: Array[Array[Int]]): Unit = {
        val m = board.length
        val n = board(0).length

        val rows =
            0 until m map { i =>
                0 until n map { j =>
                    board(i).slice(j - 1, j + 2).sum
                }
            }

        val cols = rows.transpose

        val rotatedNeighbourSums =
            0 until n map { i =>
                0 until m map { j =>
                    cols(i).slice(j - 1, j + 2).sum - board(j)(i)
                }
            }

        val neighbourSums = rotatedNeighbourSums.transpose

        0 until m foreach { i =>
            0 until n foreach { j =>
                if (neighbourSums(i)(j) < 2 || neighbourSums(i)(j) > 3) board(i)(j) = 0
                else if (board(i)(j) == 0 & neighbourSums(i)(j) == 3) board(i)(j) = 1
                else board(i)(j) = board(i)(j)
            }
        }
    }
}
// @lc code=end
