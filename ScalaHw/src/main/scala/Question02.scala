object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
    insInOrder(x, l, inserted = false)
  }
  def insInOrder(x: Int, l: List[Int], inserted: Boolean): List[Int] ={
    if (l.isEmpty) List()
    else if (l.length == 1 && l.head < x) l.head :: insInOrder(x, l.tail, inserted = true) ++ List(x)
    else if(!inserted){
      if (x <= l.head) x :: l.head :: insInOrder(x, l.tail, inserted = true)
      else l.head :: insInOrder(x, l.tail, inserted = false)
    }
    else l.head :: insInOrder(x, l.tail, inserted = true)
  }

  def main(args: Array[String]): Unit = {
    val listnum = List(1, 2, 3, 4, 7, 8)
    println(insertInOrder(20, listnum))
  }


}
