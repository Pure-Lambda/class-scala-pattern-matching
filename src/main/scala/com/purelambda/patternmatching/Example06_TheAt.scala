package com.purelambda.patternmatching

/** show case the `@` */
object Example06_TheAt {
  case class Record(a: Int, s: String) {
    def doSomething(): Unit = println("doing something")
  }

  def main(args: Array[String]): Unit = {
    val a: Record = Record(12, "Abc")

    a match {

//      case ...
      case Record(1, "b")                     => ???
      case Record(_, "c")                     => ???
      case Record(34, b) if b.startsWith("a") =>
        b match {
          case "agth"   => ???
          case "agrgrg" => ???
        }
      case Record(34, b)                      => ???
      case Record(i, s @ "abc")               => s.split(".").foreach(println(_))
      case Record(i, s) if s == "abc"         => s.split(".").foreach(println(_))
      case r @ Record(12, "Abc")              => r.doSomething()

      case Record(a, b) => ???
    }
  }
}
