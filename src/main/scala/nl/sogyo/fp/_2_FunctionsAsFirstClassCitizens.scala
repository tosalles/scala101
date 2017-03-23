package nl.sogyo.fp

object _2_FunctionsAsFirstClassCitizens {
  def Square(x: Int): Int = x * x

  def SquareToo: (Int) => Int = Square
}
