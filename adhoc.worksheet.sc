'a' != 'b'
!(' '.isDigit & 'a' == '-')


"   -42".dropWhile(p => p == ' ')
        .takeWhile(p => p.isDigit | p == '-')
        .toInt


val xs = Array(1,2,3,4)
(xs diff Array(4)). max

xs.toList.combinations(2).toList

val a2d = Array(Array(0,1,0),Array(0,0,1),Array(1,1,1),Array(0,0,0))
a2d.slice(-1,2).flatten.toList
val m = a2d.length
val n = a2d(0).length
a2d(0).slice(-1, 2).toList

val rows = 0 until m map { i =>
  0 until n map { j =>
    a2d(i).slice(j - 1, j + 2).sum
  }
}

val cols = rows.transpose

val rotatedNeighbourSums =
0 until n map { i =>
  0 until m map { j =>
    cols(i).slice(j - 1, j + 2).sum - a2d(j)(i)
  }
}

val neighbourSums = rotatedNeighbourSums.transpose

0 until m foreach { i =>
  0 until n foreach { j =>
    if (neighbourSums(i)(j) < 2 || neighbourSums(i)(j) > 3) a2d(i)(j) = 0
    else if (a2d(i)(j) == 0 & neighbourSums(i)(j) == 3) a2d(i)(j) = 1
    else a2d(i)(j) = a2d(i)(j)
  }
}

a2d.toList.map(_.toList)




xs.splitAt(2)(0).toList

scala.collection.immutable.TreeSet(2,7,4,1,8,1)


"".isBlank
" ".isBlank
" 2".isBlank

Int.MaxValue

2147483647 + 1
List.empty[Int].sum
Array[Int]()

val ys = Array(Array(1,2),Array(3,4))
val size = ys.size * ys(0).size
ys.flatten.toList.splitAt(3)


xs.indexOf(3)
