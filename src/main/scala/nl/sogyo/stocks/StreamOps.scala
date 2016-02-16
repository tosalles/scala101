package nl.sogyo.stocks

object StreamOps {
  def merge(streams: Seq[Stream[StockTick]]): Stream[StockTick] = streams.foldLeft(Stream[StockTick]())(_ #::: _)
}
