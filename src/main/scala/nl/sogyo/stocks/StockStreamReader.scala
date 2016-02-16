package nl.sogyo.stocks

import java.io.InputStream

// Stocks are from Yahoo finance http://finance.yahoo.com/q/hp?s=BAC etc
class StockStreamReader(val stockname: String) {
  val parser: String => StockTick = StockTickParser.parseLine(stockname, _)

  def Stream(): Stream[StockTick] = {
    val stream: InputStream = getClass.getResourceAsStream("/" + stockname + ".csv")
    val lines = scala.io.Source.fromInputStream(stream).getLines
    lines
      .drop(1) // drop the header
      .map(parser)
      .toStream
  }
}
