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
}