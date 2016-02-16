package nl.sogyo.fp

import org.scalatest.FunSuite

class CurryingTest extends FunSuite {
  test("A currying example") {
    val firstBound = Currying.sumCurry(3)
    val secondBound = firstBound(2)
    val finalBound = secondBound(1)
    assert(finalBound == 6)
    assert(secondBound(0) == 5)
    assert(firstBound(0)(0) == 3)
  }
}
