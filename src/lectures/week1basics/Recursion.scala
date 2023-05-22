package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App {
  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else {
        println(i)
        loop(i - 1, s"$word $acc")
      }
    }

    loop(n)
  }

  println(repeatWord("Slava", 1000))
}
