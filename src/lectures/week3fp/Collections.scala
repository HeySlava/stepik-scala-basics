package lectures.week3fp

object Collections extends App{

  private val emptySet: Set[Int] = Set()
  private val nonEmptySet: Set[Int] = Set(1, 2, 10, 10)

  val aSequence = Seq(1, 20, 10, 100)
  val aArray: Array[String] = Array("h", "e", "l", "l", "0", ".")
  aArray(5) = "!"

  println(emptySet)
  println(nonEmptySet)
  println(nonEmptySet.tail)

  println(aSequence)
  println(aSequence.search(1))

  println((1 to 10).foreach(x => print(x * 10)))


  val s = "Hello"
  val newStr: String = s.flatMap(_ + ".")

  println(newStr)



  val list = List(1, 2, 3, List(10, 20))
  val flatMappedList = list.flatMap(x => List(x, x))
  val mappedList = list.map(x => List(x, x))
  println(flatMappedList)
  println(mappedList)


  val list1 = List(1, 2, 3, 5, 10)
  val list2 = List("a", "b")

  val newList = list1.map(n => list2.map(c => n + c))
  val newList1 = list1.flatMap(n => list2.map(n + _))

  println(newList)
  println(newList1)

  val progLanguages = List("java", "scala", "python")
  val lngAbbrev = List("JA", "SCA", "PY")

  val out = lngAbbrev.flatMap(ss => progLanguages.filter(_.toUpperCase.contains(ss)).map(lng => (lng, ss)))
  println(out)


  println(Seq(2, 1, 3).sorted.search(1))
  
}
