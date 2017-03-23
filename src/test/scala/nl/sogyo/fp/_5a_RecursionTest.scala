package nl.sogyo.fp

import org.scalatest.FunSuite

class _5a_RecursionTest extends FunSuite {
  test("Define a simple sum function") {
    assert(Recursion.simpleSum(1, 10) == 55)
    intercept[StackOverflowError] {
      assert(Recursion.simpleSum(1, 10000000) == 50000005000000l)
    }
  }

  test("Define a tail-recursive sum function") {
    assert(Recursion.tailRecurseSum(1, 10) == 55)
    assert(Recursion.tailRecurseSum(1, 10000000) == 50000005000000l)
  }
}
