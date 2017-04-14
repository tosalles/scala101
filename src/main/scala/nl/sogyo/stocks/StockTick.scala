package nl.sogyo.stocks

import java.util.Date

/**
  * A StockTick contains various interesting datapoints about a stock performance over time.
  *
  * Th adjclose is a special field, which denotes the closing price, adjusted by taking `splits` and `dividend` into
  * account. A split means that the amount of shares is increased, proportionally to the value. If I have a single share
  * worth 2 euro, I get 2 shares worth 1 euro each after the split for example. The purpose is to increase liquidity of
  * the stock.
  *
  * Dividend is payed to stockholders as a way to distribute profits to the owners of a given stock.
  *
  * Obviously both actions have an impact on the value of a stock, so that's why each tick also contains an
  * `adjusted close` value of a stock. If you want to know how it is calculated, see the following link:
  * https://help.yahoo.com/kb/adjusted-close-sln28256.html
  *
  * @param name The name of a stock (in the form of its symbol, e.g. MSFT, AAPL or BAC)
  * @param date The date on which this stock had this value given the interval (we use days)
  * @param open The opening price of a stock (so on the opening of the exchange)
  * @param high The highest price of a stock during the day
  * @param low The lowest price of a stock during the day
  * @param close The closing price of the day
  * @param volume The trading volume for a given day
  * @param adjclose The adjusted closing value, given the constraints above
  */
case class StockTick(name: String, date: Date, open: Double, high: Double, low: Double, close: Double, volume: Int, adjclose: Double)