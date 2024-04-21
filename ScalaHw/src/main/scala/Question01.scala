object Question01 {
  def insertAtPosition(x: Any, pos: Int, l: List[Any]): List[Any] = {
    if (l.length <= pos) insAt(x, pos, 0, l) ++ List(x)
    else insAt(x, pos, 0, l)
  }

  def insAt(x: Any, pos: Int, i: Int, l: List[Any]): List[Any] = {
    if (l.isEmpty) List()
    else if (i == pos) x :: l.head :: insAt(x, pos, i + 1, l.tail)
    else l.head :: insAt(x, pos, i + 1, l.tail)
  }


  def main(args: Array[String]): Unit = {
    val listnum = List(0, 1, 2, 3, 4)
    println(insertAtPosition(99, 10, listnum))
    println(insertAtPosition("V", 0, List("A", "B", "C")) == List("V", "A", "B", "C"))
    println(insertAtPosition(5, 7, List(1, 2, 3, 4, 6)) == List(1, 2, 3, 4, 6, 5))
  }
}
