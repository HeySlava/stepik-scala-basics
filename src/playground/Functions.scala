package playground

object Functions extends App{
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

//  def someFunc(): Int = 2 * someFunc() + 1
//  def callSomeFunc(x: Int, y: => Int) = println(x)
//  callSomeFunc(someFunc(), 1)

  def someFunc(): Int = 2 * someFunc() + 1
  def callSomeFunc(x: Int, y: => Int) = println(x)
  callSomeFunc(1, someFunc())
}
