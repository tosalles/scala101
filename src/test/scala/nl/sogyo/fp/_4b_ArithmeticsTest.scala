package nl.sogyo.fp

import org.scalatest.FunSuite

class _4b_ArithmeticsTest extends FunSuite {

  // Create a recursive function that returns the division of two integers, use only < - == and +
  test("9 / 3 = 3") {
    assert(_4b_Arithmetics.division(9,3) == 3)
  }

  test("8 / 3 = 2") {
    assert(_4b_Arithmetics.division(8,3) == 2)
  }

  // Create a recursive function that returns the modulus/remainder of the division of two integers, use only < - == and +
  test("5 % 3 = 2") {
    assert(_4b_Arithmetics.modulus(5,3) == 2)
  }

  test("9 % 3 = 0") {
    assert(_4b_Arithmetics.modulus(9,3) == 0)
  }

  // Create a recursive function that returns the nth number in the Fibonacci sequence
  test("1st Fibonacci number is 0") {
    assert(_4b_Arithmetics.nthFibonacciNumber(1) == 0)
  }

  test("3rd Fibonacci number is 1") {
    assert(_4b_Arithmetics.nthFibonacciNumber(3) == 1)
  }

  // Currying: create a currying function that sums its two parameters
  test("Sum integers by currying") {
    assert(_4b_Arithmetics.curriedSum(1)(1) == 2)
  }

  test("Make an increment function with the partial application pattern") {
    val increment: Int => Int = _4b_Arithmetics.curriedSum(1)
    assert(increment(4) == 5)
  }

  test("Make an isEven function with the partial application pattern") {
    val isEven: Int => Boolean = _4b_Arithmetics.modulus(_: Int, 2) == 0
    assert(isEven(4))
  }
}