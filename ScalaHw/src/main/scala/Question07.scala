object Question07 {
  
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty) List()
    else f(list.head) :: myMap(f)(list.tail)
  }


  def sqpuare(x: Int): Int ={
    x * x
  }
  def main(args: Array[String]): Unit = {
    println(myMap(x => x*2)(List(1, 2, 3, 4, 5)))
    println(myMap(sqpuare)(List(1, 2, 3, 4, 5)))
    println(myMap(x => x * 2)(List()) == List())
  }

}
