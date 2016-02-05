package nl.sogyo.fp

import org.scalatest.FunSuite

class higherOrderTest extends FunSuite {
  test("Apply sum function to two ints") {
    assert(higherOrder.apply(arithmetics.sum, 1, 1) == 2)
  }

  test("Apply division function to two ints") {
    assert(higherOrder.apply(arithmetics.division, 9, 3) == 3)
  }

  test("Apply division to list of ints with map") {
    val list = List(2,4,6)
    assert(list.map(i => i / 2) == List(1,2,3))
  }

  test("Convert every boolean in the list to its counterpart") {
    val list = List(true,false,true)
    assert(list.map(b => !b) == List(false,true,false))
  }
}
