object Question10 {


  def alternate(f1: (Int, Int) => Int, f2: (Int, Int) => Int, list: List[Int]): Int = {
    if (list.isEmpty) 0
    else if (list.length == 1) list.head
    else if (list.length == 2) f1(list.head, list.tail.head)
    else if (list.length == 3) f2(f1(list.head, list.tail.head), list.tail.tail.head)
    else alternate(f1, f2, f2(f1(list.head, list.tail.head), list.tail.tail.head) :: list.tail.tail.tail)
  }

  def main(args: Array[String]): Unit = {
    println(alternate((x, y) => x + y, (x, y) => x - y, List()))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(50)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2, 3)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2, 3, 4)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2, 3, 4, 5)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2, 3, 4, 5, 6)))
    println(alternate((x, y) => x + y, (x, y) => x - y, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
  }


}
