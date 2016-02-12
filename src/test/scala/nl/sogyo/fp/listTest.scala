package nl.sogyo.fp

import org.scalatest.FunSuite

class listTest extends FunSuite {

  // Create a recursive function that takes a list and returns a list containing the even values of the supplied list
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

  // Create a recursive function that takes a list and returns the highest number in this list
  test("5 is max value in [1,2,3,4,5]") {
    assert(lists.findMax(List(1,2,3,4,5)) == 5)
  }

  test("5 is max value in [5,4,3,2,1]") {
    assert(lists.findMax(List(5,4,3,2,1)) == 5)
  }

  test("5 is max value in [3,1,5,2,4]") {
    assert(lists.findMax(List(3,1,5,2,4)) == 5)
  }
}
