package playground

object Injerit extends App {

  class Pizza private {
    override def toString = "This is pizza"
  }

  object Pizza {
    val pizza = new Pizza

    def getInstance: Pizza = {
      pizza
    }

  }
  val pizza = Pizza.getInstance
  println(pizza)
}
