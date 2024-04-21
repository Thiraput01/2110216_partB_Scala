object Question5 {
  def applySeq(x:Int) (fList: List[Int=>Int]): Int = {
    apply(x, fList, x)
  }

  def apply(i: Int, f: List[Int => Int], acc: Int): Int ={
    if(f.isEmpty) acc
    else apply(f.head(i), f.tail, f.head(i))
  }

  def main(args: Array[String]): Unit = {
    println(applySeq(1)(List((x => x+1), (x => x*x),(x => x+5)) ))
    println(applySeq(100)(List()))
  }
}
