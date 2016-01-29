package nl.sogyo.fp

object higherOrder {
  def apply(function: (Int, Int) => Int, x: Int, y: Int): Int = {
    function(x, y)
  }
}
