package nl.sogyo.fp

object arithmetics {
  def sum(x: Int, y: Int): Int = {
    x + y
  }

  def division(dividend: Int, divisor:Int): Int = {
    division(dividend, divisor, 0)
  }

  private def division(dividend: Int, divisor:Int, quotient:Int): Int = {
    if(divisor < dividend) division(dividend - divisor, divisor, quotient + 1)
    else if (divisor == dividend) quotient + 1
    else quotient
  }

  def modulus(dividend: Int, divisor: Int): Int = modulus(dividend, divisor, 0)

  private def modulus(dividend: Int, divisor: Int, remainder: Int): Int = {
    if(divisor < dividend) modulus(dividend - divisor, divisor, 0)
    else if (divisor == dividend) 0
    else dividend
  }

  def nthFibonacciNumber(nth: Int): Int = nth match {
    case 1 => 0
    case 2 => 1
    case _ => nthFibonacciNumber(nth - 1) + nthFibonacciNumber(nth - 2)
  }

  def curriedSum(x: Int)(y: Int): Int = {
    x + y
  }
}
