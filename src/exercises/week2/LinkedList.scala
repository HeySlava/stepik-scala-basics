package exercises.week2

import scala.runtime.Nothing$

object LinkedList extends App {

  abstract class LogList {

    def add(msg: String): LogList

    def previous: LogList

    def last: String

    def isEmpty: Boolean

    def all: String

  }

  object Empty extends LogList {

    def add(msg: String): LogList = new Log(msg, Empty)

    def previous = throw new NoSuchElementException

    def last = throw new NoSuchElementException

    def isEmpty: Boolean = true

    def all: String = ""

  }

  class Log(head: String, tail: LogList) extends LogList {

    def add(msg: String): LogList = new Log(msg, this)

    def last: String = head

    def previous: LogList = tail

    def all: String = {
      def loop(log: LogList, acc: String = ""): String = {
        if (log.isEmpty) acc
        else loop(log.previous, acc+ log.last + " ")
      }
      loop(this)
    }

    def isEmpty: Boolean = last.isEmpty
  }

  val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))

  println(list.all)

  println(list.previous.last)

}
