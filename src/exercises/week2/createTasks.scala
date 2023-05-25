package exercises.week2

//Instructor: id, name, surname
//
//Методы класса:
//
//  - fullName: возвращает полное имя в виде Имя Фамилия.
//
//  первые буквы имени и фамилии обязательно должны быть заглавными,
//  а на вход вполне могут передаваться данные, состоящие полностью как из больших букв, так и из маленьких.
//"is There any other WAY".split(' ').map(_.capitalize).mkString(" ")


//Course: courseID, title, releaseYear, instructor
//
//Методы класса:
//  - getID: возвращает id в формате courseID + instructor.id (например, если courseId = 1, а instructor.id = 2, то метод вернет 12)
//  - isTaughtBy(instructor): проверяет, является ли указанный человек инструктором курса
//    - copyCourse(newReleaseYear): возвращает новый экземпляр класса Course с обновленным значением поля releaseYear

object createTasks extends App {
  class Instructor(val id: Int, name: String, surname: String) {
    def fullName(name: String = name, surname: String = surname): String = {
      s"$name $surname".toLowerCase().split(" ").map(_.capitalize).mkString(" ")
    }

    def fullName: String = s"$name $surname".toLowerCase().split(" ").map(_.capitalize).mkString(" ")
  }

  class Course(courseId: Int, val title: String, val releaseYear: String, val instructor: Instructor) {
    def getID: String = s"${this.courseId}${this.instructor.id}"

    def isTaughtBy(instructor: Instructor): Boolean = {
      if (instructor == this.instructor) true else false
    }

    def copyCourse(newReleaseYear: String): Course = {
      new Course(this.courseId, this.title, newReleaseYear, this.instructor)
    }
  }


  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName()) // Вася Пупкин
  println(instructor.fullName) // Вася Пупкин


  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName()) // Вася Пупкин
  println(course.getID) // 21
  println(course.isTaughtBy(instructor)) // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин"))) // false

  println(course.copyCourse("4321").releaseYear) // 4321
}
