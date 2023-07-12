package lectures.week2oop

object GenericsLimit extends App{

  trait Thing

  class Vehicle extends Thing

  class Car extends Vehicle

  class Ambulance extends Car

  class Taxi extends Car

  class Jeep extends Car

  class Bicycle extends Vehicle

  class Tricycle extends Bicycle

  class Parking[T](val vehicle: T)

  new Parking[Bicycle](new Bicycle)

//  new Parking[Bicycle](new Car) does not work

//  but the following works
  new Parking[Car](new Jeep)


  class ParkingWithLimit[T >: Bicycle <: Vehicle](val vehicle: T)

}
