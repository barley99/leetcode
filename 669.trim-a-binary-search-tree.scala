/*
 * @lc app=leetcode id=669 lang=scala
 *
 * [669] Trim a Binary Search Tree
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
    def trimBST(root: TreeNode, low: Int, high: Int): TreeNode = {
        if (root == null) null
        else if (root.value == low) TreeNode(root.value, null, trimBST(root.right, low, high))
        else if (root.value == high) TreeNode(root.value, trimBST(root.left, low, high), null)
        else if (root.value < low) trimBST(root.right, low, high)
        else if (root.value > high) trimBST(root.left, low, high)
        else TreeNode(root.value, trimBST(root.left, low, high), trimBST(root.right, low, high))
    }
}
// @lc code=end
