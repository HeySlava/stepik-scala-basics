package exercises.week2

object CaseClasses extends App {


  object A {
    val a: String = "value a"
    println("object A")
  }

  val aVal = A
  val anotherVal = A

  println(aVal.a)
  println(anotherVal.a)


}
