package nl.sogyo.fp

import org.scalatest.FunSuite

class listTest extends FunSuite {
  test("filter evens from [1,2,3,4] == [2,4]") {
    assert(lists.filterEvens(List(1,2,3,4), List()) == List(2,4))
  }

  test("filter evens from [] == []") {
    assert(lists.filterEvens(List(), List()) == List())
  }

  test("filter evens from [2,4,6] == [2,4,6]") {
    assert(lists.filterEvens(List(2,4,6), List()) == List(2,4,6))
  }

  test("filter evens from [1,3,5] == []") {
    assert(lists.filterEvens(List(1,3,5), List()) == List())
  }

}
