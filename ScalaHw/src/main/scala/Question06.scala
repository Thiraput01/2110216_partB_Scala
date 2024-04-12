object Question06 {
  
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if(list.isEmpty) List()
    else if(f(list.head)) list.head :: myFilter(f)(list.tail)
    else myFilter(f)(list.tail)
  }

  def isLessThan3(x: Int): Boolean ={
    if(x < 3) true
    else false
  }
  def main(args: Array[String]): Unit = {
    println(myFilter(x=> x%2==0)(List(1, 2, 3, 4, 5)))
    println(myFilter(isLessThan3)(List(1, 2, 3, 4, 5)))
  }
}
