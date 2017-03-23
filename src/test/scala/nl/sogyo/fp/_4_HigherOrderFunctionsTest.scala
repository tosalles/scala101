package nl.sogyo.fp

import nl.sogyo.fp.HigherOrderFunctions.MyList
import org.scalatest.{Matchers, WordSpec}

class _4_HigherOrderFunctionsTest extends WordSpec with Matchers {
  /**
    * Inclusive range of D[x, y]
    *
    * @example range(0, 3) == List(0, 1, 2, 3)
    * @param x start
    * @param y stop
    * @return
    */
  def range(x: Int, y: Int): List[Int] = List.range(x, y + 1)

  "MyList" should {
    "Apply sum function to two ints" in {
      val result: Int = HigherOrderFunctions.apply(SayNoToAssignments.sum, 1, 1)
      result shouldBe 2
    }

    "Create a filter function on a list to test if it contains an even number" in {
      val list = range(1, 3)

      def isEven(n: Int) = n % 2 == 0

      val result: List[Int] = HigherOrderFunctions.MyList(list).ownFilter(isEven)
      result shouldBe List(2)
    }

    "Define a function increment (x+1) and map this function to a list of numbers" in {
      val list = range(1, 3)

      def increment(x: Int) = x + 1

      val result: List[Int] = HigherOrderFunctions.MyList(list).ownMap(increment)
      result shouldBe List(2, 3, 4)
    }

    "Create a higher order function that can apply the division function to two ints" in {
      val result: Int = HigherOrderFunctions.apply(Arithmetics.division, 9, 3)
      result shouldBe 3
    }

    "Apply division to list of ints with map" in {
      val list = HigherOrderFunctions.MyList(List(2, 4, 6))
      val result: List[Int] = list.ownMap(i => Arithmetics.division(i, 2))
      result shouldBe range(1, 3)
    }

    "Return all even numbers from a list using filter" in {
      val list = range(1, 10)
      val result: List[Int] = list.filter(n => n % 2 == 0)
      result should contain allOf(2, 4, 6, 8, 10)
    }

    "Convert every boolean in the list to its inverse" in {
      val list = List(true, false, true)
      val result: List[Boolean] = list.map(b => !b)
      result shouldBe List(false, true, false)
    }

    "Return every first element of a list" in {
      val list = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
      val result: List[Int] = list.map(l => l.head)
      result should contain allOf(1, 4, 7)
    }

    "Return a list of booleans based on a list of characters, where false means whitespace, true on characters" in {
      val list = "Ik werk bij Sogyo".toCharArray.toList
      val result: List[Boolean] = list.map({
        case ' ' => false
        case _ => true
      })
      result shouldBe List(true, true, false, true, true, true, true, false, true, true, true, false, true, true, true, true, true)
    }
  }

  "MyList' own fold implementation" should {
    "fold left on a small list" in {
      val list: MyList[String] = List("a", "b", "c")
      list.ownFoldLeft("")((a, e) => a + e) shouldBe "abc"
    }

    "fold right on a small list" in {
      val list: MyList[String] = List("a", "b", "c")
      list.ownFoldRight("")((a, e) => a + e) shouldBe "cba"
    }
  }
}
