package lectures.week3fp

object Options extends App{

  def unsafeMethod(): String = null

  def safeMethod(): String = "There is a String"

  val unsafeRes = Option(unsafeMethod())
  val safeRes = Option(safeMethod())

  println(unsafeRes) // None
  println(safeRes) // Some(There is a String)


  def maybeSafeMethod(): String = null

  val chainedResult = Option(unsafeMethod()).orElse(Option(maybeSafeMethod()))
  println(chainedResult) // Some(There is no harm)

  val someVal = Some(2)
  println(someVal.map(_ * 2))

}


