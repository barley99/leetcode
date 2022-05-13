/*
 * @lc app=leetcode id=700 lang=scala
 *
 * [700] Search in a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def searchBST(root: TreeNode, `val`: Int): TreeNode = {
        if (root != null && root.value == `val`) root
        else if (root.left != null && root.value > `val`) searchBST(root.left, `val`)
        else if (root.right != null && root.value < `val`) searchBST(root.right, `val`)
        else null
    }
}
// @lc code=end
