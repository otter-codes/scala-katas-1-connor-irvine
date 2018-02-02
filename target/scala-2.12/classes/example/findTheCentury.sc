import scala.io.StdIn

  val year = StdIn.readLine("enter a year: \n").toInt

  println(((year-1)/100)+1)