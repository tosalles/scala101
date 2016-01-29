package nl.sogyo.fp

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class listTest extends FunSuite {
  test("filter evens from [1,2,3,4] == [2,4]") {
    assert(lists.filterEvens(ArrayBuffer(1,2,3,4), ArrayBuffer()) == ArrayBuffer(2,4))
  }

  test("filter evens from [] == []") {
    assert(lists.filterEvens(ArrayBuffer(), ArrayBuffer()) == ArrayBuffer())
  }

  test("filter evens from [2,4,6] == [2,4,6]") {
    assert(lists.filterEvens(ArrayBuffer(2,4,6), ArrayBuffer()) == ArrayBuffer(2,4,6))
  }

  test("filter evens from [1,3,5] == []") {
    assert(lists.filterEvens(ArrayBuffer(1,3,5), ArrayBuffer()) == ArrayBuffer())
  }

}
