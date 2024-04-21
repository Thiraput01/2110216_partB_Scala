object Question1 {
  def partition(l: List[Int], f: Int => Boolean): List[List[Int]] = {
    part(l, f, List(), List())
  }

  def part(l: List[Int], f: Int => Boolean, acc1: List[Int], acc2: List[Int]):List[List[Int]] ={
    if(l.isEmpty) List(acc1, acc2)
    else if(f(l.head)) part(l.tail, f, acc1++List(l.head), acc2)
    else part(l.tail, f, acc1, acc2++List(l.head))
  }


  def f1(x: Int): Boolean ={
    x%2 == 1
  }

  def f2(x: Int): Boolean ={
    x*x > 10
  }
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 2, 3, 4, 5)
    val l2 = List(2, 3, 4)
    println(partition(l1, f1))
    println(partition(l1, f2))
    println(partition(l1, (x=> x==0) ))
    println(partition(l1, (x=> x<6) ))
  }
}