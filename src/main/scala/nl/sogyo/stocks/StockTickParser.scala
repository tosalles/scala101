package nl.sogyo.stocks

import java.util.Date

import scala.util.Try

object StockTickParser {
  def parseDouble(s: String): Double = s.toDouble

  def parseInt(s: String): Int = s.toInt

  def parseDate(s: String): Date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(s)

  def parseLine(name: String, line: String): Try[StockTick] = Try {
    val splitted = line.split(",")

    StockTick(
      name,
      parseDate(splitted(0)),
      parseDouble(splitted(1)),
      parseDouble(splitted(2)),
      parseDouble(splitted(3)),
      parseDouble(splitted(4)),
      parseInt(splitted(5)),
      parseDouble(splitted(6))
    )
  }
}
