object kata extends App {

  def makeList (Number: Int) : List[Int] = {
    val y = (1 to Number).toList.reverse
    y
  }
  println(makeList(5))