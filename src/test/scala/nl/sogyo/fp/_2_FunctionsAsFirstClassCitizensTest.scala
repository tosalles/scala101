package nl.sogyo.fp

import org.scalatest.FunSuite

class _2_FunctionsAsFirstClassCitizensTest extends FunSuite {
  test("Define a function that squares a number") {
    assert(_2_FunctionsAsFirstClassCitizens.Square(1) == 1)
    assert(_2_FunctionsAsFirstClassCitizens.Square(2) == 4)
    assert(_2_FunctionsAsFirstClassCitizens.Square(3) == 9)
  }

  test("Used it as an alias") {
    assert(_2_FunctionsAsFirstClassCitizens.SquareToo(1) == 1)
    assert(_2_FunctionsAsFirstClassCitizens.SquareToo(2) == 4)
    assert(_2_FunctionsAsFirstClassCitizens.SquareToo(3) == 9)
  }
}
