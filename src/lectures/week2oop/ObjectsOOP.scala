package lectures.week2oop

object ObjectsOOP extends App {
  class Student(val name: String)

  class Course(val title: String, val instructor: String) {
    val id = "cs_101"
    println(id)
  }

  val course = new Course("Scala", "Bob")
  val student = new Student("Sam")

  println(student.name)
  println(course.title)

}
