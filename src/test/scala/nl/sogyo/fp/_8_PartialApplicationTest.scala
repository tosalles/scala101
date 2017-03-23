package nl.sogyo.fp

import org.scalatest.FunSuite

class _8_PartialApplicationTest extends FunSuite {
  test("Partial applied function pointing to the successor.") {
    val pred: Int => Int = _8_PartialApplication.successor()
    assert(pred(4) == 5)
  }
  test("Retrieve a partially applied sum function resulting in the caller's predecessor.") {
    val pred: Int => Int = _8_PartialApplication.predecessor()
    assert(pred(4) == 3)
  }
}
