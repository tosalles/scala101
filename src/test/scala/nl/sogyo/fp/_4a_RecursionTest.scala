package nl.sogyo.fp

import org.scalatest.FunSuite

class _4a_RecursionTest extends FunSuite {
  test("Define a simple sum function") {
    assert(_4a_Recursion.simpleSum(1, 10) == 55)
    intercept[StackOverflowError] {
      assert(_4a_Recursion.simpleSum(1, 10000000) == 50000005000000l)
    }
  }

  test("Define a tail-recursive sum function") {
    assert(_4a_Recursion.tailRecurseSum(1, 10) == 55)
    assert(_4a_Recursion.tailRecurseSum(1, 10000000) == 50000005000000l)
  }
}
