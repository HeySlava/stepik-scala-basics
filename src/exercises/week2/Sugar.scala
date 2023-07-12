

package exercises.week2
import scala.language.postfixOps

object Sugar extends App{

  class Person(val name: String, occupation: String) {
    def worksAs(jobName: String): String = s"$name is a $jobName"

    def isDeveloper = this worksAs("Scala Developer")
  }

  val bob = new Person("Bob", "Developer")
  println(bob isDeveloper)

}
