package nl.sogyo.stocks

object StreamOps {
  def merge(streams: Seq[Stream[StockTick]]): Stream[StockTick] = List[StockTick]().toStream
}
