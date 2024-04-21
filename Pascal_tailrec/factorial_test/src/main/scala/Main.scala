object Main {
  def factorial(x: Int): Int = {
    factorial(x, 1)
  }

  def factorial(x: Int, acc: Int): Int ={
    if(x==0) acc
    else factorial(x-1, x*acc)
  }
  def main(args: Array[String]): Unit = {
    println(factorial(4))
    val l = List(1, 2, 4, 67)
    println( l ++ List(5))

  }
}