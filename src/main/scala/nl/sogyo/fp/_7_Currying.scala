package nl.sogyo.fp

object _7_Currying {
  def sum(x: Int, y: Int, z: Int): Int = 0

  def sumCurry(x: Int): Int => (Int => Int) = y => z => 0

  def sumCurryTwo(x: Int)(y: Int)(z: Int): Int = 0
}
