package com.purelambda.patternmatching

import scala.annotation.tailrec

/** with sealed trait and case object */
object Example02_CaseObject {
  sealed trait Action
  case object Walk extends Action
  case object Run extends Action
  case object Talk extends Action

  @tailrec
  def processAction(action: Action): Unit =
    action match {
      case Run  => println("running")
      case Talk => println("Talking")
      case Walk =>
        println("walking")
        processAction(Run)
    }

  def main(args: Array[String]): Unit = {
    val a: Action = Walk
    processAction(a)
  }
}
