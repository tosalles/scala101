package nl.sogyo.fp

object Currying {
  def sum(x:Int, y:Int, z:Int):Int = 0

  def sumCurry(x: Int):Int => (Int => Int)
}
