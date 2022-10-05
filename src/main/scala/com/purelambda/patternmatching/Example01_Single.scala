package com.purelambda.patternmatching

/**
 * with a val: String and val: Int used as a switch
 *
 * show case default `case _ =>` too
 *
 * and show match exception
 */
object Example01_Single {
  def main(args: Array[String]): Unit = {
    val a: Int = 123

    a match {
      case 2     => println("we found a")
      case 123   => println("we found 123")
      case value => println(s"Error, we dont know how to deal with : $value")
//      case "hello" => println("we found hello")
    }
  }
}
