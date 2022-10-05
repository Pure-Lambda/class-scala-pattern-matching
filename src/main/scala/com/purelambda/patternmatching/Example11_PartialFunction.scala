package com.purelambda.patternmatching

/** Use inside a PartialFunction */
object Example11_PartialFunction {
  def main(args: Array[String]): Unit = {
    val l: List[(String, Int)] = List(("A", 1), ("b", 2), ("abc", 21))

    l.filter {
        case (s, i) if i <= 2 => true
        case _                => false
      }
      .map { case (s, _) => s }
      .foreach(println(_))

    l.collect {
        case (s, i) if i <= 2 => s
      }
      .foreach(println(_))

    val pf: PartialFunction[Int, String] = {
      case 12         => "abc"
      case d if d < 2 => "small"
    }

    val a: Int = 345

    println(pf.applyOrElse[Int, String](a, s => s"unknown: $s"))


//    A => B -> exhaustive
//    Function[A, B] -> exhaustive
//    PartialFunction[A, B] -> dont have to
  }
}
