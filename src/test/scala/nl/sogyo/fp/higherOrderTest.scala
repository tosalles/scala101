package nl.sogyo.fp

import org.scalatest.FunSuite

class higherOrderTest extends FunSuite {
  test("Apply sum function to two ints") {
    assert(higherOrder.apply(arithmetics.sum, 1, 1) == 2)
  }

  test("Apply division function to two ints") {
    assert(higherOrder.apply(arithmetics.division, 9, 3) == 3)
  }
}
