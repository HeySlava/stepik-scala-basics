package lectures.week2oop

object GenericType extends App{

  def randomItem[A](items: List[A]): A = {
    val randomIndex = util.Random.nextInt(items.length)
    items(randomIndex)
  }

  println(randomItem(List("a", "bc", "def")))
  println(randomItem(List(1.5, 2.75, 3.8)))


  class SomeClass[T] {
    def someFunc(aVal: T): Unit = println(s"generic type is used")
  }

  val anInstance = new SomeClass[String]
  anInstance.someFunc("slava")

}
