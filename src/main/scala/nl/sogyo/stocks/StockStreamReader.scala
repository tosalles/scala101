package nl.sogyo.stocks

import scala.io.Source
import scala.util.{Success, Try}

// Stocks are from Yahoo finance http://finance.yahoo.com/q/hp?s=BAC etc
class StockStreamReader(val stockname: String) {
  val parser: String => Try[StockTick] = StockTickParser.parseLine(stockname, _)

  def stream(): Stream[StockTick] = Source
    .fromInputStream(getClass.getResourceAsStream(s"/$stockname.csv"))
    .getLines
    .map(parser)
    .collect {
      case Success(st) => st
    }
    .toStream
    .reverse
}
