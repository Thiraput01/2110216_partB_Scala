import scala.annotation.tailrec

object Question4 {
  private def differenceFromBoth(l1: List[Any], l2: List[Any]): List[Any] ={
    compare(l1, l2, List()) ++ compare(l2, l1, List())
  }

  @tailrec
  def compare(toComp: List[Any], l: List[Any], acc: List[Any]): List[Any] ={
    if(toComp.isEmpty) acc
    else if( !isMember(toComp.head, l) ) compare(toComp.tail, l, acc ++ List(toComp.head))
    else compare(toComp.tail, l, acc)
  }

  @tailrec
  def isMember(c: Any, l: List[Any]): Boolean ={
    if(l.isEmpty) false
    else if(c == l.head) true
    else isMember(c, l.tail)
  }


  def main(args: Array[String]): Unit = {
    println("test")
    val l1 = List(5,1,2,4)
    val l2 = List(10,2,4,6,8)
//    println(compare(l1, l2, List()))
//    println(compare(l2, l1, List()))

    println(differenceFromBoth(List(),l2)) // List(10, 2, 4, 6, 8)
    println(differenceFromBoth(l1,List())) // List(5, 1, 2, 4)
    println(differenceFromBoth(l1,l2))// List(5, 1, 10, 6, 8)
  }
}
