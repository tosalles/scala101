package nl.sogyo.fp

import org.scalatest.FunSuite

class PartialApplicationTest extends FunSuite {
  test("Partial applied function pointing to the successor.") {
    val pred: Int => Int = PartialApplication.successor()
    assert(pred(4) == 5)
  }
  test("Retrieve a partially applied sum function resulting in the caller's predecessor.") {
    val pred: Int => Int = PartialApplication.predecessor()
    assert(pred(4) == 3)
  }
}
