package nl.sogyo.stocks

object StreamOps {
  def merge[T](streams: Stream[T]*): Stream[T] = streams.foldLeft(Stream.empty[T])(_ #::: _)
}
