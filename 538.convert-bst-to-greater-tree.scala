import javax.swing.tree.TreeNode
/*
 * @lc app=leetcode id=538 lang=scala
 *
 * [538] Convert BST to Greater Tree
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

    def convertBST(root: TreeNode): TreeNode = {
        def loop(root: TreeNode, total: Int = 0): Int =
            if (root != null) {
                root.value += loop(root.right, total)
                loop(root.left, root.value)
            }
            else total
        loop(root)
        root
    }
}
// @lc code=end
