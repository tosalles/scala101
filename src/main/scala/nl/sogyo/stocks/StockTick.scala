package nl.sogyo.stocks

import java.util.Date

case class StockTick(name: String, date: Date, open: Double, high: Double, low: Double, close: Double, volume: Int, adjclose: Double)