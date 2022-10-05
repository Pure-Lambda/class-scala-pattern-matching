package com.purelambda.patternmatching

import scala.annotation.tailrec

/** show the `case head :: rest =>` */
object Example09_WithList {
  def sum(l: List[Int]): Int = {
    @tailrec
    def loop(acc: Int, l: List[Int]): Int =
      l match {
        case Nil          => acc
        case head :: rest => loop(acc + head, rest)
      }

    loop(0, l)
  }

  def main(args: Array[String]): Unit = {
    val l: List[Int] = List(1, 2, 3, 4, 5, 6)

    val ss = sum(l)
    println(ss)

    l match {
      case Nil                    => println("empty")
      case head :: Nil            => println(s"$head")
      case head :: second :: Nil  => println(s"$head , $second")
      case head :: second :: rest => println(s"$head, $second, $rest")
    }
  }
}
