package nl.sogyo.stocks

import java.io.InputStream

import scala.util.Try

// Stocks are from Yahoo finance http://finance.yahoo.com/q/hp?s=BAC etc
class StockStreamReader(val stockname: String) {
  val parser: String => Try[StockTick] = StockTickParser.parseLine(stockname, _)

  def stream(): Stream[StockTick] = {
    val stream: InputStream = getClass.getResourceAsStream(s"/$stockname.csv")
    val lines = scala.io.Source.fromInputStream(stream).getLines
    List[StockTick]().toStream
  }
}
