package playground

import scala.annotation.tailrec

object Recursion extends App {
  def stepic(fArgs: Array[String]): String = {
    @tailrec
    def loop(count: Int,  res: Int = fArgs(0).toInt): String = {
      if (count == 0) s"$res " * res.toString.length + "is the result"
      else loop(count-1, res + fArgs(2).toInt)
    }
    loop(fArgs(1).toInt, fArgs(0).toInt)
  }
  println(stepic(Array("10", "1", "5")))
}
