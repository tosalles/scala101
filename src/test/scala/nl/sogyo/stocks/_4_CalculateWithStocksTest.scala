package nl.sogyo.stocks

import java.util.Date

import org.scalatest.{Matchers, WordSpec}

class _4_CalculateWithStocksTest extends WordSpec with Matchers {
  val BAC = new StockStreamReader("BAC")
  val MSFT = new StockStreamReader("MSFT")
  val CSCO = new StockStreamReader("CSCO")
  val ALL = StreamOps.merge(BAC.stream(), MSFT.stream(), CSCO.stream())

  "Calculating the average stock closing price given a certain period" should {
    "work as expected when the period has enough data" in {
      val partial = BAC.stream().take(3)
      val result = CalculateWithStocks.averageClosingPrice(partial, 3)
      result should have length 1
      result should contain (("BAC", new Date(631234800000l), new Date(631234800000l), 46.541666666666664))
    }
    "also work as expected when the period does not have enough data" in {
      val partial = BAC.stream().take(3)
      val result = CalculateWithStocks.averageClosingPrice(partial, 5)
      result should have length 1
      result should contain (("BAC", new Date(631234800000l), new Date(631234800000l), 46.541666666666664))
    }
  }
  "Calculating the average stock opening price given a certain period" should {
    "work as expected when the period has enough data" in {
      val partial = BAC.stream().take(3)
      val result = CalculateWithStocks.averageOpeningPrice(partial, 3)
      result should have length 1
      result should contain (("BAC", new Date(631234800000l), new Date(631234800000l), 46.416666666666664))
    }
    "also work as expected when the period does not have enough data" in {
      val partial = BAC.stream().take(3)
      val result = CalculateWithStocks.averageOpeningPrice(partial, 5)
      result should have length 1
      result should contain (("BAC", new Date(631234800000l), new Date(631234800000l), 46.416666666666664))
    }
  }
  "Calculating the average price per stock per year" should {
    "work just fine" in {
      val result = CalculateWithStocks.averageClosingPricePerStockPerYear(ALL)
      // TODO: properly assert this test.
      result.sorted foreach println
    }
  }
  // TODO: create tests for the following funcs
  //bestPerformingStockPerYear(stocks: Stream[StockTick]): Stream[(String, Int, Double)] = ???
  //biggestDeltaWithinOneYear(stocks: Stream[StockTick]): Stream[(String, Int, Double)] = ???
  //def lowestOpeningPricePerYear(stocks: Stream[StockTick]): Stream[(String, Date, Double)] = ???
  //def highestClosingPricePerYear(stocks: Stream[StockTick]): Stream[(String, Date, Double)] = ???
  //def lowestOpeningPriceWithinPeriod(stocks: Stream[StockTick], start: Date, end: Date): Stream[(String, Date, Double)] = ???
  //def highestClosingPriceWithinPeriod(stocks: Stream[StockTick], start: Date, end: Date): Stream[(String, Date, Double)] = ???
}
