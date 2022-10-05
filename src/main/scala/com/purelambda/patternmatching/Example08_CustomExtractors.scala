package com.purelambda.patternmatching

/** show case how to use `def unapply` */
object Example08_CustomExtractors {
  case class Record(i: Int, s: String)

  object RecordWithLength {
    def unapply(r: Record): Option[(Int, String, Int)] = ???
  }

  case class RecordFilter(f: Record => Boolean) {
    def unapply(r: Record): Boolean = f(r)
  }

  def main(args: Array[String]): Unit = {
    val r:      Record       = ???
    val Filter: RecordFilter = ???

  }
}
