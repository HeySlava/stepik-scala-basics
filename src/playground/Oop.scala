package playground

object Oop extends App {

  class Student(val name: String) {
    def getId(name: String): String =
      s"This: ${this.name}, Not this: ${name}"

    def getId: String = s"Without arguments: $name"
  }

  val student = new Student("Init")
  println(student.getId("Slava"))
  println(student.getId)

}
