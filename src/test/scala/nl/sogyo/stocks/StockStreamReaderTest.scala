package nl.sogyo.stocks

import org.scalatest.FunSuite

class StockStreamReaderTest extends FunSuite {
  test("Read a stream of stocks") {
    val bac = new StockStreamReader("BAC")
    val ticks = bac.Stream().take(3).toArray
    assert(ticks.length == 3)
    assert(ticks(0).close == 11.95)
    assert(ticks(1).close == 11.16)
  }

  test("Merge stock streams") {
    val CSCO = new StockStreamReader("CSCO")
    val MSFT = new StockStreamReader("MSFT")

    assert(CSCO.Stream().length == 6524)
    assert(MSFT.Stream().length == 6582)

    val merged: Stream[StockTick] = CSCO.Stream() #::: MSFT.Stream()

    assert(merged.length == 13106)
  }

  test("Merge any amount of streams") {
    val CSCO = new StockStreamReader("CSCO")
    val MSFT = new StockStreamReader("MSFT")
    val BAC = new StockStreamReader("BAC")

    val merged = StreamOps.merge(Seq(CSCO.Stream(), MSFT.Stream(), BAC.Stream()))

    assert(merged.length == 19688)
  }
}
