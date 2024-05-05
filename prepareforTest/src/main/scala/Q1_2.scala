

object Q1_2 {
  def indivOp(l1:List[Int], l2: List[Int], l3:List[(Int,Int) => Int]): List[Int] = {
    if(l1.isEmpty) return List()

    var f = l3.head
    return f(l1.head,l2.head) :: indivOp(l1.tail,l2.tail,l3.tail)
  }

  def indivOp(l1:List[Int], l2: List[Int], l3:List[(Int,Int) => Int], acc:List[Int]): List[Int] = {
     //write this version
    if(l1.isEmpty) acc
    else indivOp(l1.tail, l2.tail, l3.tail, acc ++ List(l3.head(l1.head, l2.head)))
  }

  def f1(x: Int, y: Int): Int = x + y

  def f2(x: Int, y: Int): Int = x * y

  def f3(x: Int, y: Int): Int = x - y

  def main(args: Array[String]): Unit = {
    val l1 = List(9, 3, 6)
    val l3: List[(Int, Int) => Int] = List(f1, f2, f3)
    val l2 = List(2, 8, 7)

    println(indivOp(l1, l2, l3))
    println(indivOp(l1, l2, l3, List()))
  }
}
