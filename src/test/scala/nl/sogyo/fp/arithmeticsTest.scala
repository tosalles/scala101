package nl.sogyo.fp

import org.scalatest.FunSuite

class arithmeticsTest extends FunSuite {

  test("1 + 1 = 2") {
    assert(arithmetics.sum(1,1) == 2)
  }

  test("9 / 3 = 3") {
    assert(arithmetics.division(9,3) == 3)
  }

  test("8 / 3 = 2") {
    assert(arithmetics.division(8,3) == 2)
  }

  test("5 % 3 = 2") {
    assert(arithmetics.modulus(5,3) == 2)
  }

  test("9 % 3 = 0") {
    assert(arithmetics.modulus(9,3) == 0)
  }

  test("1st Fibonacci number is 0") {
    assert(arithmetics.nthFibonacciNumber(1) == 0)
  }

  test("3rd Fibonacci number is 1") {
    assert(arithmetics.nthFibonacciNumber(3) == 1)
  }

  test("Sum integers by currying") {
    assert(arithmetics.curriedSum(1)(1) == 2)
  }

  test("Make an increment function with the partial application pattern") {
    val increment = arithmetics.curriedSum(1) _
    assert(increment(4) == 5)
  }

  test("Make an isEven function with the partial application pattern") {
    val isEven = arithmetics.isFullyDivisable(_: Int, 2)
    assert(isEven(4))
  }
}