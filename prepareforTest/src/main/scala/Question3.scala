object Question3 {
  def identifyMax(x: Int) (l: List[Int => Int]): Int=> Int={
    def find(x: Int): Int={
      compare(x, l, l.head(x))
    }
    find
  }

  def compare(x: Int, l: List[Int=> Int], curMax: Int): Int ={
    if(l.isEmpty) curMax
    else if(l.head(x) > curMax) compare(x, l.tail, l.head(x))
    else compare(x, l.tail, curMax)
  }

  def f1(a: Int): Int = a*a - 2*a + 20
  def f2(a:Int):Int = a*a + 2*a
  def f3(a:Int):Int = a*a + a + 10

  def main(args: Array[String]): Unit = {
    println("test")
    val l:List[Int=>Int] = List(f1, f2, f3)
    val l2:List[Int=>Int] = List(f1, f2)
    println(identifyMax(0)(l)(1)) //19
    println(identifyMax(2)(l)(2)) //20
    println(identifyMax(3)(l)(3)) //23
    println(identifyMax(4)(l)(4)) //30
    println(identifyMax(5)(l)(5)) //40
    println(identifyMax(6)(l)(6)) //52
    println(identifyMax(4)(l2)(4)) //28
    println(identifyMax(6)(l2)(6)) //48
  }
}
