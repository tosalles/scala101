package nl.sogyo.fp

object _8_PartialApplication {
  def sum(x: Int)(y: Int): Int = x + y

  def successor():Int => Int = sum(1)
  def predecessor():Int => Int = sum(-1)
}
