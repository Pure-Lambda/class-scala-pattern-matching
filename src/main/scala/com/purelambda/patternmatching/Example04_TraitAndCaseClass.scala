package com.purelambda.patternmatching

/** with a case class with sealed trait with case object */
object Example04_TraitAndCaseClass {
  sealed trait Action
  case class Take(item: String) extends Action
  case object Walk extends Action
  case object Talk extends Action

  def main(args: Array[String]): Unit = {}
}
