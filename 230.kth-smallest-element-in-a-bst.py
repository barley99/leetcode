#
# @lc app=leetcode id=230 lang=python3
#
# [230] Kth Smallest Element in a BST
#

# @lc code=start
# Definition for a binary tree node.
from typing import Optional
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        def loop(root: Optional[TreeNode], cnt: int) -> Optional[int]:
            if root == None:
                return root
            loop(root.left, cnt)
            cnt -= 1
            if cnt == 0:
                return root.val
            loop(root.right, cnt)
        return loop(root, k)


# @lc code=end
