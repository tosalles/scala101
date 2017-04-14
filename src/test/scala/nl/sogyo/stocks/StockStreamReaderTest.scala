package nl.sogyo.stocks

import org.scalatest.{Matchers, WordSpec}

class StockStreamReaderTest extends WordSpec with Matchers {
  "A stream of stocks" should {
    "be read and parsed" in {
      val bac = new StockStreamReader("BAC")
      val ticks = bac.stream().take(3).toList
      ticks should have length 3
      ticks.head.close shouldBe 46.625
      ticks(1).close shouldBe 47.0
    }
    "have the correct number of entries" in {
      val CSCO = new StockStreamReader("CSCO")
      val MSFT = new StockStreamReader("MSFT")
      val BAC = new StockStreamReader("BAC")

      CSCO.stream() should have length 6524
      MSFT.stream() should have length 6582
      BAC.stream() should have length 6582
    }
  }
}
