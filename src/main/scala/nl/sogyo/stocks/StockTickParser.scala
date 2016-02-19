package nl.sogyo.stocks

import java.util.Date

object StockTickParser {
  def parseLine(name: String, line: String): StockTick = new StockTick("", new Date(), 1.0, 0.0, 0.0, 1, 0, 1.0)
}
