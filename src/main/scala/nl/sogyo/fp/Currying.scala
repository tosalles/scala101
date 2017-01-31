package nl.sogyo.fp

object Currying {
  def sum(x: Int, y: Int, z: Int): Int = x + y + z

  def sumCurry(x: Int): Int => (Int => Int) = y => z => x + y + z

  def sumCurryTwo(x: Int)(y: Int)(z: Int): Int = x + y + z
}
