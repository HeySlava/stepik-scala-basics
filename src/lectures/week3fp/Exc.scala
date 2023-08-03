package lectures.week3fp

import scala.util.{Try, Success}

object Exc extends App{

  def unsafeMethod(): String = throw new RuntimeException("Sorry, not your day")

  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure) // Failure(java.lang.RuntimeException: Sorry, not your day)

  val anotherPotentialFailure = Try {
    Try(unsafeMethod())
//    "another failure"
  }

  println(anotherPotentialFailure)


  val s = Success(10)

  println(s)
  println(s.filter(_ > 10))

}
