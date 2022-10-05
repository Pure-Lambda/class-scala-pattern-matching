package com.purelambda.patternmatching

import scala.annotation.tailrec

/** Instead of `def method(arg: A): B` define a `def method: A => B =` */
object Example13_FlatMap {
  def map[A, B](l: List[A])(f: A => B): List[B] = {
    def loop(acc: List[B] = Nil): List[A] => List[B] = {
      case Nil          => acc
      case head :: rest => loop(acc :+ f(head))(rest)
    }
    loop()(l)
  }

  def flatten[A](l: List[List[A]]): List[A] = {
    def loop(acc: List[A] = Nil): List[List[A]] => List[A] = {
      case Nil          => acc
      case head :: rest => loop(acc ++ head)(rest)
    }

    loop()(l)
  }

  def flatMap[A, B](l: List[A])(f: A => List[B]): List[B] = flatten(map(l)(f))

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6)

    flatMap(l) {
      case 1 => Nil
      case n => (0 until n).toList
    }.foreach(println(_))
  }
}
