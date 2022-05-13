/*
 * @lc app=leetcode id=897 lang=scala
 *
 * [897] Increasing Order Search Tree
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
    def toList(tree: TreeNode): List[Int] = {
        if (tree == null) Nil
        else toList(tree.left) ++ (tree.value :: toList(tree.right))
    }

    def increasingBST(root: TreeNode): TreeNode = {
        val tree = toList(root)
            .foldRight(TreeNode(0, null, null))((elem, tree) => {tree.value = elem; new TreeNode(0, null, tree)})
        tree.right
    }
}
// @lc code=end
