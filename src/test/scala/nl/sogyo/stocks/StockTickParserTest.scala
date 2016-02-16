package nl.sogyo.stocks

import java.util.Date

import org.scalatest.FunSuite

class StockTickParserTest extends FunSuite {
  test("Parse a line from the stock picker") {
    val line = "2016-02-08,49.549999,49.57,48.189999,49.41,57006100,49.41"
    val tick = StockTickParser.parseLine("my-name", line)
    assert(tick.name == "my-name")
    assert(tick.date == new Date(1454886000000l))
    assert(tick.open == 49.549999)
    assert(tick.high == 49.57)
    assert(tick.low == 48.189999)
    assert(tick.close == 49.41)
    assert(tick.volume == 57006100)
    assert(tick.adjclose == 49.41)
  }
}
