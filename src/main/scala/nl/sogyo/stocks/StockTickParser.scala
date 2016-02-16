package nl.sogyo.stocks

import scala.util.control.NonFatal

object StockTickParser {
  def parseDouble(s: String) = s.toDouble

  def parseInt(s: String) = s.toInt

  def parseDate(s: String) = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  def parseLine(name: String, line: String): StockTick = {
    try {
      val splitted = line.split(",")

      new StockTick(
        name,
        parseDate(splitted(0)),
        parseDouble(splitted(1)),
        parseDouble(splitted(2)),
        parseDouble(splitted(3)),
        parseDouble(splitted(4)),
        parseInt(splitted(5)),
        parseDouble(splitted(6))
      )
    } catch {
      case NonFatal(_) => null
    }
  }
}
