package nl.sogyo.stocks

import java.util.Date

import org.scalatest.{Matchers, WordSpec}

class _1_StockTickParserTest extends WordSpec with Matchers {
  val line = "2016-02-08,49.549999,49.57,48.189999,49.41,57006100,49.41"
  "Parsing a line from a stock ticker" should {
    val parsedTick = StockTickParser.parseLine("my-name", line)
    "succeed" in {
      parsedTick.isSuccess shouldBe true
    }
    "have the correct name" in {
      parsedTick.get.name shouldBe "my-name"
    }
    "have the correct values" in {
      val tick = parsedTick.get
      tick.date shouldBe new Date(1454886000000l)
      tick.open shouldBe 49.549999
      tick.high shouldBe 49.57
      tick.low shouldBe 48.189999
      tick.close shouldBe 49.41
      tick.volume shouldBe 57006100
      tick.adjclose shouldBe 49.41
    }
  }
}
