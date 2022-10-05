package com.purelambda.patternmatching

/** Use inside a .map{} */
object Example10_InsideMap {
  def main(args: Array[String]): Unit = {
    val l: List[String] = List("abc", "bar", "foo", "hello", "world")

    l.map {
      ???
    }
  }
}
