package exercises

object test_test extends App {
  val someValue = {
    1 < 0
    2 == 5
    4 < 9
  }

  val someCodeBlock = {
    if (someValue) 1 else 0
    100
  }

  println(someCodeBlock)

}
