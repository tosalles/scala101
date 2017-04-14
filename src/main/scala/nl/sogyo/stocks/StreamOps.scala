package nl.sogyo.stocks

object StreamOps {
  /**
    * Merge various streams into one. No guarantees about the order are given.
    * @param streams One or more streams
    * @tparam T of type T
    * @return A new stream containing all data from the parametrized streams
    */
  def merge[T](streams: Stream[T]*): Stream[T] = streams.foldLeft(Stream.empty[T])(_ #::: _)
}
