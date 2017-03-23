package nl.sogyo.fp

object _7_Currying {
  def sum(x: Int, y: Int, z: Int): Int = x + y + z

  def sumCurry(x: Int): Int => (Int => Int) = y => z => x + y + z

  def sumCurryTwo(x: Int)(y: Int)(z: Int): Int = x + y + z
}
