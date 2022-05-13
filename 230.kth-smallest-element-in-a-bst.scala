import javax.swing.tree.TreeNode
/*
 * @lc app=leetcode id=230 lang=scala
 *
 * [230] Kth Smallest Element in a BST
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
    def kthSmallest(root: TreeNode, k: Int): Int = {
        def reverseOrder(root: TreeNode, ls: List[Int]): List[Int] =
            if (root == null) ls
            else reverseOrder(root.left, root.value :: reverseOrder(root.right, ls))
        reverseOrder(root, Nil).drop(k - 1).head
    }
}
// @lc code=end
