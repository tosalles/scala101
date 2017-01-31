package nl.sogyo.fp

import org.scalatest.FunSuite

class ListTest extends FunSuite {

  // Create a recursive function that takes a list and returns a list containing the even values of the supplied list
  test("filter evens from [1,2,3,4] == [2,4]") {
    assert(Lists.filterEvens(List(1,2,3,4)) == List(2,4))
  }

  test("filter evens from [] == []") {
    assert(Lists.filterEvens(List()) == List())
  }

  test("filter evens from [2,4,6] == [2,4,6]") {
    assert(Lists.filterEvens(List(2,4,6)) == List(2,4,6))
  }

  test("filter evens from [1,3,5] == []") {
    assert(Lists.filterEvens(List(1,3,5)) == List())
  }

  // And for pattern matching:
  test("filter with patternmatching evens from [1,2,3,4] == [2,4]") {
    assert(Lists.filterEvensPatternMatching(List(1,2,3,4)) == List(2,4))
  }

  test("filter with patternmatching evens from [] == []") {
    assert(Lists.filterEvensPatternMatching(List()) == List())
  }

  test("filter with patternmatching evens from [2,4,6] == [2,4,6]") {
    assert(Lists.filterEvensPatternMatching(List(2,4,6)) == List(2,4,6))
  }

  test("filter with patternmatching evens from [1,3,5] == []") {
    assert(Lists.filterEvensPatternMatching(List(1,3,5)) == List())
  }

  // Create a recursive function that takes a list and returns the highest number in this list
  test("5 is max value in [1,2,3,4,5]") {
    assert(Lists.findMax(List(1,2,3,4,5)) == 5)
  }

  test("5 is max value in [5,4,3,2,1]") {
    assert(Lists.findMax(List(5,4,3,2,1)) == 5)
  }

  test("5 is max value in [3,1,5,2,4]") {
    assert(Lists.findMax(List(3,1,5,2,4)) == 5)
  }
}
