from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        node = root
        while node:
            if node.val == val:
                return node
            if node.val > val:
                node = node.left
            else:
                node = node.right
        return None

solution = Solution()
tree = TreeNode(4,
            TreeNode(2,TreeNode(1,None,None),TreeNode(3,None,None)),
            None)

print(solution.searchBST(tree, 2).val)