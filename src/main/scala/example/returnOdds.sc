 def makeList (Number: Int) : List[Int] = {
    val y = List.range(1, Number)
   y.filter(x => x % 2 != 0)
  }
 makeList(15).length