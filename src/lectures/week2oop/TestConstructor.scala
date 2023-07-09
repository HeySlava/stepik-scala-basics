package lectures.week2oop

object TestConstructor extends App {
  class SomeClass(a: Int, b: Int, val c: Int) {
    def someFunc(): Int = b
  }

  val test = new SomeClass(10, 20, 30)
  println(test.someFunc())
  println(test.c)
}
