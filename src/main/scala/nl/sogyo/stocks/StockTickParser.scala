package nl.sogyo.stocks

import java.util.Date

import scala.util.Try

object StockTickParser {
  def parseDouble(s: String): Double = s.toDouble

  def parseInt(s: String): Int = s.toInt

  def parseDate(s: String): Date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(s)

  def parseLine(name: String, line: String): Try[StockTick] = Try {
    StockTick("", new Date(), 1.0, 0.0, 0.0, 1, 0, 1.0)
  }
}
