package nl.sogyo.fp

import org.scalatest.FunSuite

class FunctionsAsFirstClassCitizensTest extends FunSuite {
  test("Define a function that squares a number") {
    assert(FunctionsAsFirstClassCitizens.Square(1) == 1)
    assert(FunctionsAsFirstClassCitizens.Square(2) == 4)
    assert(FunctionsAsFirstClassCitizens.Square(3) == 9)
  }

  test("Used it as an alias") {
    assert(FunctionsAsFirstClassCitizens.SquareToo(1) == 1)
    assert(FunctionsAsFirstClassCitizens.SquareToo(2) == 4)
    assert(FunctionsAsFirstClassCitizens.SquareToo(3) == 9)
  }
}
