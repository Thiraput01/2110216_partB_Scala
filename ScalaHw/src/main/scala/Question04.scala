object Question04 {
  def palindrome(l: List[Any]): Boolean = {
    val l2 = makerev(l)
    isPal(l, l2)
  }

  def isPal(l: List[Any], l2: List[Any]): Boolean ={
    if(l.isEmpty || l2.isEmpty) true
    else (l2.head == l.head) && isPal(l.tail, l2.tail)
  }

  def makerev(l: List[Any]): List[Any] ={
    if(l.isEmpty) List()
    else makerev(l.tail) ++ List(l.head)
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 2, 1)
    val l1 = List(1, 2, 3 ,4 ,5)
    println(palindrome(l))
    println(palindrome(l1))
  }


}