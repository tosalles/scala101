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

  test("Return every first element of a list") {
    val list = List(List(1,2,3), List(4,5,6), List(7,8,9))
    assert(list.map(l => l.head) == List(1,4,7))
  }

  test("Return a list of booleans based on a list of characters, where false means whitespace, true on characters") {
    val list = "Ik werk bij Sogyo".toCharArray.toList
    assert(list.map(c => if(c == ' ') false; else true) == List(true, true, false, true, true, true, true, false, true, true, true, false, true, true, true, true, true))
  }
}
