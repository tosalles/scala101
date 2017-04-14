package nl.sogyo.stocks

import java.util.Date

object CalculateWithStocks {
  /**
    * Given a stream of mixed stock ticks, find the lowest opening price per stock per year
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def lowestOpeningPricePerYear(stocks: Stream[StockTick]): Stream[(String, Date, Double)] = ???

  /**
    * Given a stream of mixed stock ticks, find the highest closing price per stock per year
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def highestClosingPricePerYear(stocks: Stream[StockTick]): Stream[(String, Date, Double)] = ???

  /**
    * Given a stream of mixed stock ticks, find the lowest opening price per stock within a given period
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def lowestOpeningPriceWithinPeriod(stocks: Stream[StockTick], start: Date, end: Date): Stream[(String, Date, Double)] = ???

  /**
    * Given a stream of mixed stock ticks, find the highest closing price per stock within a given period
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def highestClosingPriceWithinPeriod(stocks: Stream[StockTick], start: Date, end: Date): Stream[(String, Date, Double)] = ???

  /**
    * Calculate the average closing price of stocks for each period, given a stream and a length in days
    *
    * @param stocks       A stream of stocks
    * @param lengthInDays The number of days denoting the length of each period. If the stream ends, just do a partial
    *                     calulation, but adjust th average accordingly.
    *                     Note: you can assume that lengthInDays is >= 1
    */
  def averageClosingPrice(stocks: Stream[StockTick], lengthInDays: Int): Stream[(String, Date, Date, Double)] =
    averageOHLCPrice(stocks.grouped(lengthInDays).toStream, (t: StockTick) => t.close)

  /**
    * Calculate the average opening price of stocks for each period, given a stream and a length in days
    *
    * @param stocks       A stream of stocks
    * @param lengthInDays The number of days denoting the length of each period. If the stream ends, just do a partial
    *                     calulation, but adjust th average accordingly.
    *                     Note: you can assume that lengthInDays is >= 1
    */
  def averageOpeningPrice(stocks: Stream[StockTick], lengthInDays: Int): Stream[(String, Date, Date, Double)] =
    averageOHLCPrice(stocks.grouped(lengthInDays).toStream, (t: StockTick) => t.open)

  /**
    * Calculate the average closing price of a stock in windows of calendar years.
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def averageClosingPricePerStockPerYear(stocks: Stream[StockTick]): Stream[(String, Date, Date, Double)] =
    averageOHLCPrice(stocks.groupBy(t => (t.name, t.date.getYear)).values.toStream, (t: StockTick) => t.close)

  /**
    * Given a stream of mixed stock ticks, find the best performing stock per year
    * (metric: highest delta between first opening and last adjusted closing value)
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def bestPerformingStockPerYear(stocks: Stream[StockTick]): Stream[(String, Int, Double)] = ???

  /**
    * Given a stream of mixed stock ticks, find the biggest delta between opening and adjclose between two
    * arbitrary days during a fiscal year
    *
    * @param stocks A stream of stocks. These can be mixed by ticker symbol
    */
  def biggestDeltaWithinOneYear(stocks: Stream[StockTick]): Stream[(String, Int, Double)] = ???

  private def averageOHLCPrice(stocks: Stream[Stream[StockTick]], selector: StockTick => Double): Stream[(String, Date, Date, Double)] = {
    stocks.map { partial =>
      val first = partial.head
      val result = partial
        .drop(1)
        .foldLeft((first.name, first.date, first.date, selector(first)))((acc, tick) => {
          acc.copy(_4 = acc._4 + selector(tick))
        })
      result.copy(_4 = result._4 / partial.size)
    }
  }
}
