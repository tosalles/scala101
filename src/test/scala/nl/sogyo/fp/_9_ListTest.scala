package nl.sogyo.fp

import org.scalatest.FunSuite

class _9_ListTest extends FunSuite {

  // Create a recursive function that takes a list and returns a list containing the even values of the supplied list
  test("filter evens from [1,2,3,4] == [2,4]") {
    assert(_9_Lists.filterEvens(List(1,2,3,4)) == List(2,4))
  }

  test("filter evens from [] == []") {
    assert(_9_Lists.filterEvens(List()) == List())
  }

  test("filter evens from [2,4,6] == [2,4,6]") {
    assert(_9_Lists.filterEvens(List(2,4,6)) == List(2,4,6))
  }

  test("filter evens from [1,3,5] == []") {
    assert(_9_Lists.filterEvens(List(1,3,5)) == List())
  }

  // And for pattern matching:
  test("filter with patternmatching evens from [1,2,3,4] == [2,4]") {
    assert(_9_Lists.filterEvensPatternMatching(List(1,2,3,4)) == List(2,4))
  }

  test("filter with patternmatching evens from [] == []") {
    assert(_9_Lists.filterEvensPatternMatching(List()) == List())
  }

  test("filter with patternmatching evens from [2,4,6] == [2,4,6]") {
    assert(_9_Lists.filterEvensPatternMatching(List(2,4,6)) == List(2,4,6))
  }

  test("filter with patternmatching evens from [1,3,5] == []") {
    assert(_9_Lists.filterEvensPatternMatching(List(1,3,5)) == List())
  }

  // Create a recursive function that takes a list and returns the highest number in this list
  test("5 is max value in [1,2,3,4,5]") {
    assert(_9_Lists.findMax(List(1,2,3,4,5)) == 5)
  }

  test("5 is max value in [5,4,3,2,1]") {
    assert(_9_Lists.findMax(List(5,4,3,2,1)) == 5)
  }

  test("5 is max value in [3,1,5,2,4]") {
    assert(_9_Lists.findMax(List(3,1,5,2,4)) == 5)
  }

  // Create a recursive function that takes a list and calculates the length of this list
  test("An empty list is of length 0") {
    assert(_9_Lists.length(List()) == 0)
  }

  test("A list [5,5,5] is of length 3") {
    assert(_9_Lists.length(List(5,5,5)) == 3)
  }

  test("A long list should not be a problem") {
    assert(_9_Lists.length(List.range(0, 10000)) == 10000)
  }
}
