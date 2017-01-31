package nl.sogyo.stocks

object StreamOps {
  def merge[T](streams: Stream[T]*): Stream[T] = List[T]().toStream
}
