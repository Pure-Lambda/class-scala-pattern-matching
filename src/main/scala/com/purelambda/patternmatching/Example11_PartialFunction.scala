package com.purelambda.patternmatching

/** Use inside a PartialFunction */
object Example11_PartialFunction {
  def main(args: Array[String]): Unit = {
    val l: List[(String, Int)] = List(("A", 1), ("b", 2), ("abc", 21))

    l.collect(???)
  }
}
