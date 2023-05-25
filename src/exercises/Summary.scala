package exercises

object Summary extends App {

  def stepic(input: String): Unit = {
    println(input.split(raw"\s+").toList.reverse.mkString(" "))
  }
  stepic("Slava DVA    sdkfjdsf  k")
}
