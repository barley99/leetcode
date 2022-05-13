

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

val tree = TreeNode(4, TreeNode(1, null, TreeNode(2, null, null)), TreeNode(6, null, null))

def bstToList(root: TreeNode): List[Option[Int]] =
    if (root == null) List(None)
    else bstToList(root.left) ++ List(Some(root.value)) ++ bstToList(root.right)

val values = bstToList(tree).flatten
val sums = values.foldRight(List.empty[Int])((elem, acc) => acc.headOption.getOrElse(0) + elem :: acc)

def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    def loop(`val`: Int, buffer: List[TreeNode]): TreeNode = {
        if (buffer == Nil) null
        else if (buffer.head != null & buffer.head.value == `val`) buffer.head
        else loop(`val`, buffer.head.left :: buffer.head.right :: buffer.tail)
    }
    loop(`val`, List(root))
}

def kthSmallest(root: TreeNode, k: Int): Int = {
    def inorder(root: TreeNode, ls: List[Int]): List[Int] =
        if (root == null) ls
        else inorder(root.right, root.value :: inorder(root.left, ls))
    inorder(root, Nil).reverse.drop(k - 1).head
}

val tree2 = TreeNode(3, TreeNode(1, null, TreeNode(2, null, null)), TreeNode(4, null, null))
kthSmallest(tree2, 1)