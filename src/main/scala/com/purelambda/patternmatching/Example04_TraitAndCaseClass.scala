package com.purelambda.patternmatching

/** with a case class with sealed trait with case object */
object Example04_TraitAndCaseClass {
  sealed trait Action
  case class Take(item: String) extends Action
  case object Walk extends Action
  case object Talk extends Action
  case object Run extends Action

  def main(args: Array[String]): Unit = {
    val a: Action = Take("shoe")

    a match {
      case Take(item) if item.startsWith("s") => ???
      case Take(item)                         => ???
      case Walk                               => ???
      case Talk                               => ???
      case Run                                => ???
    }
  }
}
