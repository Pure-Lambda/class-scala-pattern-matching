package com.purelambda.patternmatching

/** extract in a val with tuples */
object Example05_InAVal {
  def make(): (Int, String) = (12, "abc")

  def main(args: Array[String]): Unit = {
    val a: (Int, String) = make()

    val i: Int    = a._1
    val s: String = a._2

    val (ii, ss) = make()

    println(ii)
    println(ss)

  }
}
