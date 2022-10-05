package com.purelambda.patternmatching

/** Instead of `def method(arg: A): B` define a `def method: A => B =` */
object Example12_DefineMethod {
  def foo(arg: Int): String =
    arg match {
      case a if a < 5 => ???
      case 12         => "12"
      case _          => ???
    }

  val bar: Int => String = {
    case a if a < 5 => ???
    case 12         => "12"
    case _          => ???
  }

  def main(args: Array[String]): Unit = {
    val a = 12

    println(foo(a))
    println(bar(a))
  }
}
