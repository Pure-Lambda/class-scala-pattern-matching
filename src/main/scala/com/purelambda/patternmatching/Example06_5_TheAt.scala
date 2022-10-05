package com.purelambda.patternmatching

/** show case the `@` */
object Example06_5_TheAt {
  sealed trait Action

  case class Take(item: String) extends Action

  case object Walk extends Action

  case object Talk extends Action

  case object Run extends Action

  def main(args: Array[String]): Unit = {
    val a: Action = Take("shoe")

    a match {
      case aa @ (Run | Take(_)) => println(aa)
      case Walk | Talk          => ???
    }
  }
}
