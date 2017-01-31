package nl.sogyo.fp

object FunctionsAsFirstClassCitizens {
  def Square(x: Int): Int = 0
  def SquareToo: (Int) => Int = (i:Int) => i
}
