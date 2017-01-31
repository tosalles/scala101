package nl.sogyo.stocks

import org.scalatest.{Matchers, WordSpec}

class StockStreamReaderTest extends WordSpec with Matchers {
  "A stream of stocks" should {
    "be read and parsed" in {
      val bac = new StockStreamReader("BAC")
      val ticks = bac.stream().take(3).toList
      ticks should have length 3
      ticks.head.close shouldBe 11.95
      ticks(1).close shouldBe 11.16
    }
    "merge stock streams" in {
      val CSCO = new StockStreamReader("CSCO")
      val MSFT = new StockStreamReader("MSFT")

      CSCO.stream() should have length 6524
      MSFT.stream() should have length 6582

      val merged = CSCO.stream() #::: MSFT.stream()

      merged should have length 13106
    }
    "merge any number of streams" in {

      val CSCO = new StockStreamReader("CSCO")
      val MSFT = new StockStreamReader("MSFT")
      val BAC = new StockStreamReader("BAC")

      val merged = StreamOps.merge(CSCO.stream(), MSFT.stream(), BAC.stream())

      merged should have length 19688
    }
  }
}
