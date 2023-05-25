package exercises

object Task_2_5 extends App {

  def multiply(i: Int): Int = i * multiply(i)
  // исправьте код
  def aCondition(): Boolean = if (1 < 2) true else false

  def someFunc(x: Int, y: => Int): Int = {
    if (true) x * 2 else multiply(y)
  }

  println(someFunc(3, multiply(4)))
}
