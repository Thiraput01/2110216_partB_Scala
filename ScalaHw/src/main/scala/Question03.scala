object Question03 {
  

  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if(l1.isEmpty) true
    else isMember(l1.head, l2) && subList(l1.tail, l2)
  }

  def isMember(k: Any, l2:List[Any]): Boolean ={
    if(l2.isEmpty) false
    else if(l2.head == k) true
    else isMember(k, l2.tail)
  }

  def main(args: Array[String]): Unit = {
    val l1 = List()
    val l2 = List(2, 5, 4, 3, 1, 2)
    println(subList(l1, l2))
    println(subList(List("R", "B", "X", "R"), List("B", "X", "R")) == true)
  }

}
