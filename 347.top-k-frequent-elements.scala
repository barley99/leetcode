/*
 * @lc app=leetcode id=347 lang=scala
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
object Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
        nums
            .groupMapReduce(identity)(_ => 1)(_ + _)
            .toArray
            .sortBy{ case (_, value) => -value }
            .take(k)
            .map{ case (key, _) => key }
    }
}
// @lc code=end
