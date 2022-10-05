package com.purelambda.patternmatching

/** with sealed trait and case object */
object Example02_CaseObject {
  sealed trait Action
  case object Walk extends Action
  case object Run extends Action
  case object Talk extends Action

  def main(args: Array[String]): Unit = {
    val a: Action = ???
  }
}
