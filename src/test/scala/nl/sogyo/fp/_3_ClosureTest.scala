package nl.sogyo.fp

import org.scalatest.FunSuite

class _3_ClosureTest extends FunSuite {
  test("Define a scale function using a variable from the closure's object scope") {
    assert(Closure.scale(12) == 120)
    assert(Closure.scale(-5) == -50)
  }
}
