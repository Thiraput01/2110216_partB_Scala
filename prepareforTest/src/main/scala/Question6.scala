import scala.annotation.tailrec

object Question6 {

  def moreThanHalf(l1:List[Any],l2:List[Any]):Boolean ={
    val half: Float = l1.length.toFloat / 2
    val c = countMember(l1, l2, 0)
    if(half > 0 && c >= half) true
    else  false
  }

  @tailrec
  def countMember(l1: List[Any], l2: List[Any], acc: Int): Int ={
    if(l1.isEmpty) acc
    else if( isMember(l1.head, l2) ) countMember(l1.tail, l2, acc+1)
    else countMember(l1.tail, l2, acc)
  }

  @tailrec
  def isMember(c: Any, l: List[Any]): Boolean ={
    if(l.isEmpty) false
    else if(l.head == c) true
    else  isMember(c, l.tail)
  }
  def main(args: Array[String]): Unit = {
    val l00 = List()
    val l01 = List()
    val l1 = List(1, 4, 3, 2, 7, 8)
    val l2 = List(2, 9, 7, 1, 6, 10)
    val l3 = List(12, 11, 6, 5, 3, 2)
    val l4 = List("1", "2", "3", "4", "5")
    val l5 = List("9", "7", "5", "3", "1")
    val l6 = List("2", "4", "6", "8", "10")
    println(moreThanHalf(l00,l01))
    println(moreThanHalf(l1,l01))
    println(moreThanHalf(l1,l2))
    println(moreThanHalf(l1,l3))
    println(moreThanHalf(l4,l5))
    println(moreThanHalf(l4,l6))
  }
}
