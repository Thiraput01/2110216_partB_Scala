import scala.annotation.tailrec

object Q3_2 {
  var score = 0;
  
  def replaceData(l:List[Int], pos:Int, data:Int):List[Int] = {
    //Assume the list l is never empty
    //pos is assumed to indicate correct position in the list (never go outside possible values)
    rep(l, pos, 0, data, List())


  }

  def rep(l: List[Int], pos: Int, i: Int, data: Int, acc: List[Int]): List[Int] ={
    if(l.isEmpty) acc
    else if(i == pos) rep(l.tail, pos, i+1, data, acc++List(data))
    else rep(l.tail, pos, i+1, data, acc++List(l.head))
  }



  def updateFreq(l: List[Int], freqList:List[Int]):List[Int] ={
    updatef(l, freqList)
  }

  @tailrec
  def updatef(l: List[Int], acc: List[Int]): List[Int] ={
    if(l.isEmpty) acc
    else{
      val newVal = acc(l.head) + 1
      updatef( l.tail, replaceData(acc, l.head, newVal) )
    }

  }

  def testReplace01(): Unit = {
    val l1 = List(6)
    val result = replaceData(l1,0,2)
    if(result.head == 2) score = score +1;
  }

  def testReplace02(): Unit = {
    val l1 = List(1,2,3,4,5)
    var result = replaceData(l1,1,9)
    result = replaceData(result,3,11)
    result = replaceData(result,4,15)

    if(result(0) == 1 && result(1) == 9 && result(2) ==3) score = score +1;
    if(result(3) == 11 && result(4) == 15 ) score = score +1;
  }

  def testUpdateFreq01():Unit ={
    val freqList = List(0,0,0,0,0)
    var l = List()
    if(updateFreq(l,freqList) == freqList) score = score +1
  }

  def testUpdateFreq02():Unit ={
    val freqList = List(0,0,0,0,0)
    var l = List(4,3,2,3,4,0,3)
    var result = updateFreq(l,freqList)
    if(result(0) == 1) score = score +1;
    if(result(1) == 0) score = score +1;
    if(result(2) == 1) score = score +1;
    if(result(3) == 3) score = score +1;
    if(result(4) == 2) score = score +1;
  }

  def testUpdateFreq03():Unit ={
    val freqList = List(1,0,0,2)
    var l = List(3,3,0,3)
    var result = updateFreq(l,freqList)
    if(result(0) == 2 && result(3) == 5 ) score = score +1;
  }

  def main(args: Array[String]): Unit = {
    testReplace01();
    testReplace02();
    testUpdateFreq01();
    testUpdateFreq02();
    testUpdateFreq03();
    val l = List(4, 3, 2, 3, 4, 0, 3)
    val freqL = List(0, 1, 0, 0, 2)
    println(updateFreq(l, freqL))

     print(score)
  }
}
