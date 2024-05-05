import scala.annotation.tailrec

object Q1_1 {

  def sortTwoLists(l1:List[Int],l2:List[Int]): (List[Int],List[Int]) = {
    val len1 = l1.length
    val len2 = l2.length
    val l = combine(l1, l2)
    val sortedL = mergesort(l)
    part(sortedL, len1, 0, List(), List())
  }

  @tailrec
  def part(l: List[Int], len1: Int, n: Int, acc1: List[Int], acc2: List[Int]): (List[Int], List[Int]) = {
    if (l.isEmpty) (acc1, acc2)
    else if ( n < len1 ) part(l.tail, len1, n+1, acc1 ++ List(l.head), acc2)
    else part(l.tail, len1, n+1, acc1, acc2 ++ List(l.head))
  }
  @tailrec
  def combine(l1: List[Int], l2: List[Int]): List[Int] ={
    if(l2.isEmpty) l1
    else combine(l2.head :: l1, l2.tail)
  }

  def mergesort(l: List[Int]): List[Int] ={
    val mid = l.length / 2
    if (mid == 0) return l
    val left = getList(l, 0, mid, 0)
    val right = getList(l, mid, l.length, 0)
    merge(mergesort(left), mergesort(right))
  }

  def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    if (l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else if (l1.head < l2.head) l1.head :: merge(l1.tail, l2)
    else l2.head :: merge(l1, l2.tail)
  }

  def getList(l: List[Int], start: Int, end: Int, i: Int): List[Int] = {
    if (i == end) List()
    else if (start <= i && i <= end) l.head :: getList(l.tail, start, end, i + 1)
    else getList(l.tail, start, end, i + 1)
  }

  def main(args: Array[String]): Unit = {
    val l1 = List(5, 2, 4)
    val l2 = List(7, 8, 9, 1, 2, 3, 5)
    println(sortTwoLists(l1, l2))
  }





}
