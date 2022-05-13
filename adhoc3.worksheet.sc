sealed abstract class Tree[+A] extends Product with Serializable
final case class Node[A](value: A, left: Tree[A], right: Tree[A]) extends Tree[A]
case object None extends Tree[Nothing]

val tree = Node(5, Node(1, None, None), Node(7, None, None))


tree

def toList[A](tree: Tree[A]): List[A] = {
  tree match {
    case None => Nil
    case Node(value, left, right) => toList(left) ++ (value :: toList(right))
  }
}

toList(tree)

def toRightTree[A](tree: Tree[A]): Tree[A] = {
  tree match {
    case None => None
    case Node(value, None, right) => Node(value, None, toRightTree(right))
    case Node(value, left, right) => Node(left.value, None, Node(value, None, toRightTree(right)))
  }
}