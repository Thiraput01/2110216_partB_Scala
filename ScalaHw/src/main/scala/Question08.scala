object Question08 {

  def maxAll(lists:List[List[Int]]) :List[Int] = {
    if(lists.isEmpty) List()
    else createList(lists.head, maxAll(lists.tail))
  }

  def createList(l1: List[Int], l2:List[Int]): List[Int] ={
    if(l1.isEmpty) l2
    else if(l2.isEmpty) l1
    else if(l1.head > l2.head) l1.head :: createList(l1.tail, l2.tail)
    else l2.head :: createList(l1.tail, l2.tail)
  }

  def main(args: Array[String]): Unit = {
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1, 2, 3, 4, 8, 9), List(), List(4, 5), List(1, 2, 3, 5, 6, 10, 11))))
    println(maxAll( List(List(3, 4), List(1, 2, 3, 4, 51, 61), List(1, 2, 31, 41, 61, 51)) ))
    println(maxAll( List(List(1, 2, 3, 40, 5, 6), List(10, 2, 30, 4), List(1, 200), List(0, 0, 0, 0, 0, 0, 0, 0 ,9)) ))
    val l1 = List(1, 2, 3, 4, 8, 9)
    val l2 = List(4, 5)
    println(createList(l1, l2))
  }
}
