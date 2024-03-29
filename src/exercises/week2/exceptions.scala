package exercises.week2

object exceptions extends App{

  def createElement[A](el: A): A = {
    el
  }

  val anInt = createElement(2)
  val aString = createElement("some string")
  println(s"anInt = $anInt, aString = $aString") // anInt = 2, aString = some string


  case class Vehicle(name: String)

  val aVehicle = createElement(Vehicle("car"))

  println(s"aVehicle = $aVehicle, Vehicle.name = ${aVehicle.name}")
  // aVehicle = Vehicle(car), Vehicle.name = car

}
