package com.purelambda.patternmatching

/** show case how to use `def unapply` */
object Example08_CustomExtractors {
  case class Record(i: Int, s: String)

  object RecordWithLength {
    def unapply(r: Record): Option[(Int, String, Int)] = Some((r.i, r.s, r.s.length))
  }

  object RecordWithIntLessThan5 {
    def unapply(r: Record): Option[(Int, String)] = if(r.i < 5) Some((r.i, r.s)) else None
  }

  case class RecordFilter(f: Record => Boolean) {
    def unapply(r: Record): Boolean = f(r)
  }

  def main(args: Array[String]): Unit = {
    val r:      Record       = Record(123, "hello world")
    val Filter: RecordFilter = RecordFilter(_.i > 20)

    r match {
      case r @ RecordWithIntLessThan5(i, s) => println(s"less than five: $i, $s, $r")
//      case RecordWithLength(i, s, length)   => println(length)
      case Filter()                         => println("found it")
    }
  }
}
