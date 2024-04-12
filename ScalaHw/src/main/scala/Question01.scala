object Question01 {
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] ={
    insAt(x, pos, 0, l)
  }

  def insAt(x: Any, pos: Int, i: Int, l: List[Any]): List[Any] ={
    if(l.isEmpty) List()
    else if(i == pos) x :: l.head :: insAt(x, pos, i+1, l.tail)
    else l.head :: insAt(x, pos, i+1, l.tail)
  }

  def main(args: Array[String]): Unit = {
    val listnum = List(0, 1, 2, 3, 4)
    println(insertAtPosition(99, 2, listnum))
  }
}
