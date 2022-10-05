package com.purelambda.patternmatching

/** Instead of `def method(arg: A): B` define a `def method: A => B =` */
object Example12_DefineMethod {
  def foo(arg: Int): String        = ???
  def bar:           Int => String = ???

  def main(args: Array[String]): Unit = {}
}
