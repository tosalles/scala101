package nl.sogyo.fp

import org.scalatest.FunSuite

class _3_ClosureTest extends FunSuite {
  test("Define a scale function using a variable from the closure's object scope") {
    assert(_3_Closure.scale(12) == 120)
    assert(_3_Closure.scale(-5) == -50)
  }
}
