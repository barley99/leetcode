import scala.collection.IndexedSeqView
import scala.collection.StringView
import scala.collection.View

object F {
  def compact2(s: String): View[Option[Char]] =
    var skip = 0
    s.view.reverse.map { c =>
      if (c == '#') {skip += 1; None}
      else if (skip > 0) {skip -= 1; None}
      else Some(c)
    }.filter(_ != None)

  def compact(s: String): String =
    s.foldLeft(List.empty[Char]) {
      case (acc, '#') => acc.drop(1)
      case (acc, elem) => elem :: acc
    }.mkString("")

  }

(1 until 1).toList

val s = "ab######d"
val t = "a#c#d"

F.compact(s) == F.compact(t)

F.compact(s).zipAll(F.compact(t), None, None).forall(_ == _)

None == None
F.compact("ab##")
F.compact("ab##").toList


val n = 8

val (a, b) = (1 until n).foldLeft((0, 1)){ case ((a, b), _) => (b, a + b) }
a + b


val fibs: LazyList[Int] = 0 #:: fibs.scanLeft(1)(_ + _)

fibs(n + 1)

fibs(46)

(1,2).toList.sum



(3 to n).foldLeft((1, 2)){ case ((a, b), _) => (b, a + b) }._2 - 1