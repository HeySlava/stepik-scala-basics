package exercises.week2

//аша задача - реализовать два класса: Button и RoundedButton.
//
//Для класса Button
//
//предусмотрите возможность указания label типа String при
//создании экземпляра класса
//  пропишите метод def click(): String, возвращающий строку,
//в которой указан label, заданный при создании кнопки:  button -label- has been clicked




//Для RoundedButton
//
//предусмотрите наледование от Button
//  реализуйте метод click, который похож на родительский метод click,
//но в отличие от него содержит слово rounded перед button: rounded button -label- has been clicked


object TestButtons extends App {

  class Button(label: String = "test") {
    def click(): String = s"button -${label}- has been clicked"
  }

  class RoundedButton(label: String) extends Button(label) {
    override def click(): String = s"rounded ${super.click()}"
  }

  class TestButton extends Button {
    override def click: String = s"test ${super.click()}"
  }
  val t = new TestButton
  println(t.click())
}
