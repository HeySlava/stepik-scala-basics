package lectures.week3fp

import java.io.Serializable
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object FunctionsFP extends App with Serializable {

   def apply(dateToParse: String): String = {

    if (dateToParse != null) {
      validateDate(cleanDate(dateToParse))
    } else {
      null
    }
  }

  private val cleanDate: String => String = rawDate => {
    var dateToParseSplit = rawDate.split(" ")(0)

    if (dateToParseSplit.split("\\.").length == 3) {
      val Array(day, month, year) = dateToParseSplit.split("\\.")
      dateToParseSplit = s"${addSymbol(day, "0", 2)}.${addSymbol(month, "0", 2)}.${addSymbol(year, "0", 4)}"
    }
    dateToParseSplit
  }

  private val addSymbol: (String, String, Int) => String = (word, s, n) => {
    if (word.length >= n) word
    else addSymbol(s + word, s, n)
  }


  private val validateDate: String => String = dateToValidate => {
    val pattern = "dd.MM.yyyy"
    val formatter = DateTimeFormatter.ofPattern(pattern)
    try {
      LocalDate.parse(dateToValidate, formatter).format(formatter)
    } catch {
          case _: Throwable => "Slava"
    }
  }

  println(FunctionsFP.apply("10.10.1990"))
  println(FunctionsFP.apply("01.01.2020"))
  println(FunctionsFP.apply("1.1.2020"))
  println(FunctionsFP.apply("1.1.20"))


}
