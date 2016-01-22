package nl.sogyo.fp

import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("Hello, World!") {
    assert(hello.hello("World") == "Hello, World!")
  }

  test("1 + 1 = 2") {
    assert(hello.sum(1,1) == 1)
  }
}