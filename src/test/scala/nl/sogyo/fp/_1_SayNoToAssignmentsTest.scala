package nl.sogyo.fp

import org.scalatest.FunSuite

class _1_SayNoToAssignmentsTest extends FunSuite {

  test("Define a function that sums its parameters. E.g. sum(1,1) = 2") {
    assert(_1_SayNoToAssignments.sum(1, 1) == 2)
  }

  test("So don't use var if possible") {
    val a = 1
    // This won't work:
    // a = 2
    assert(true)
  }
}