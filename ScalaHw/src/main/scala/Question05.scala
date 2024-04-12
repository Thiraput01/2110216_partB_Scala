object Question05 {

  def mergesort(l: List[Int]):List[Int] ={
    val mid = l.length / 2
    if(mid == 0) return l
    val left = getList(l, 0, mid, 0)
    val right = getList(l, mid, l.length, 0)
    merge(mergesort(left), mergesort(right))
  }

  def merge(l1: List[Int], l2: List[Int]): List[Int] ={
    if(l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else if (l1.head < l2.head) l1.head :: merge(l1.tail, l2)
    else l2.head :: merge(l1, l2.tail)
  }

  def getList(l: List[Int], start: Int, end: Int, i: Int): List[Int] ={
    if(i == end) List()
    else if( start <= i && i <= end)  l.head :: getList(l.tail, start, end, i+1)
    else getList(l.tail, start, end, i+1)
  }

  def main(args: Array[String]): Unit = {
    val l = List(2, 3, 1, 4, 5)
    val l2 = List(-43, 21, 33, 21, -29)
    val l3 = List(23, 3, 1, 4, 5)
//    println(mergesort(l))
    println(getList(l3, -1, 2, 0))
//    println(getList(l3, 2, 5, 0))
    println(mergesort(l2))
  }
}

