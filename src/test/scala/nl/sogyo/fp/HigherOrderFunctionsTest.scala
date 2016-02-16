package nl.sogyo.fp

import org.scalatest.FunSuite

class HigherOrderFunctionsTest extends FunSuite {
  test("Apply sum function to two ints") {
    val result: Int = HigherOrderFunctions.apply(SayNoToAssignments.sum, 1, 1)
    assert(result == 2)
  }

  test("Create a filter function on a list to test if it contains an even number") {
    val list = List(1,2,3)
    def isEven(n: Int) = n % 2 == 0
    val result: List[Int] = HigherOrderFunctions.myList(list).ownFilter(isEven)
    assert(result == List(2))
  }

  test("Define a function increment (x+1) and map this function to a list of numbers") {
    val list = List(1,2,3)
    def increment(x: Int) = x + 1
    val result: List[Int] = HigherOrderFunctions.myList(list).ownMap(increment)
    assert(result == List(2,3,4))
  }

  test("Create a higher order function that can apply the division function to two ints") {
    val result: Int = HigherOrderFunctions.apply(arithmetics.division, 9, 3)
    assert(result == 3)
  }

  test("Apply division to list of ints with map") {
    val list = HigherOrderFunctions.myList(List(2,4,6))
    val result: List[Int] = list.ownMap(i => arithmetics.division(i, 2))
    assert(result == List(1,2,3))
  }

  test("Return all even numbers from a list using filter") {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    val result: List[Int] = list.filter(n => n % 2 == 0)
    assert(result == List(2,4,6,8,10))
  }

  test("Convert every boolean in the list to its counterpart") {
    val list = List(true,false,true)
    val result: List[Boolean] = list.map(b => !b)
    assert(result == List(false,true,false))
  }

  test("Return every first element of a list") {
    val list = List(List(1,2,3), List(4,5,6), List(7,8,9))
    val result: List[Int] = list.map(l => l.head)
    assert(result == List(1,4,7))
  }

  test("Return a list of booleans based on a list of characters, where false means whitespace, true on characters") {
    val list = "Ik werk bij Sogyo".toCharArray.toList
    val result: List[Boolean] = list.map(c => if(c == ' ') false else true)
    assert(result == List(true, true, false, true, true, true, true, false, true, true, true, false, true, true, true, true, true))
  }
}
