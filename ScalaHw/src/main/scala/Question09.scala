object Question09 {

  val tape = List('C','H','A','R')
  def f1(x: Char): Char = {
    x match {
      case 'C' => 'c'
      case 'H' => 'h'
      case 'A' => 'a'
      case 'R' => 'r'
    }
  }

  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if(tape.isEmpty || n == 0) tape
    else f(tape.head) :: turingStep(f, tape.tail, n-1)
  }

  def main(args: Array[String]): Unit = {
    println(turingStep(f1, tape, 2))
    println(turingStep(f1, tape, 3))
    println(turingStep(f1, tape, 0))
    println(turingStep(f1, tape, 5))
  }


}
