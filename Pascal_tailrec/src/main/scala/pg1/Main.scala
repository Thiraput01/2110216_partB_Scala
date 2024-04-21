package pg1

import scala.annotation.tailrec

object Main {
  @tailrec
  private def pascal(c: Int, r: Int, sum: Int): Int = {
    if (c==0 || c==r) sum
    else pascal(c-1, r-1, sum * (r-c)/c)
  }
  def main(args: Array[String]): Unit = {
    val acc = 0
    println(pascal(3, 7, acc))
  }
}