package com.purelambda.patternmatching

/** with a case class */
object Example03_CaseClasses {
  case class Record(a: Int, s: String)

  def main(args: Array[String]): Unit = {
    val a: Record = Record(12, "Abc")

    a match {
      case Record(12, "a")                    => println("12,a")
      case Record(1, "b")                     => ???
      case Record(_, "c")                     => ???
      case Record(34, b) if b.startsWith("a") =>
        b match {
          case "agth"   => ???
          case "agrgrg" => ???
        }
      case Record(34, b)                      => ???
      case Record(a, b)                       => ???
    }
  }
}

object AsCaseClass {
  case class A(a: Int, b: Boolean)

  val a: A = A(12, true)

  a.copy(b = false)
}

object AsClass {
  class A(val a: Int, val b: Boolean) {
    def copy(a: Int = this.a, b: Boolean = this.b): A = new A(a, b)

    override def toString: String = s"A($a,$b)"
  }

  val a: A = A(12, true)

  a.copy(b = false)

  object A {
    def apply(a: Int, b: Boolean): A = new A(a, b)

    def unapply(a: A): Option[(Int, Boolean)] = Some((a.a, a.b))
  }
}
