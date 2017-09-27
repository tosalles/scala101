package nl.sogyo.fp

object _7_Currying {
  def sum(x: Int, y: Int, z: Int): Int = ???

  def sumCurry(x: Int): Int => (Int => Int) = ???

  def sumCurryTwo(x: Int)(y: Int)(z: Int): Int = ???
}
