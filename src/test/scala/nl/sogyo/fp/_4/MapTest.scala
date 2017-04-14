package nl.sogyo.fp._4

import nl.sogyo.Range
import nl.sogyo.fp._4_HigherOrderFunctions.MyList
import org.scalatest.{Matchers, WordSpec}

class MapTest extends WordSpec with Matchers with Range {

  "MyList with ownMap" should {
    "Define a function increment (x+1) and map this function to a list of numbers" in {
      val list = range(1, 3)

      def increment(x: Int) = x + 1

      val result: List[Int] = MyList(list).ownMap(increment)
      result shouldBe List(2, 3, 4)
    }

    "Apply division to list of ints with map" in {
      val list = MyList(List(2, 4, 6))
      val result: List[Int] = list.ownMap(i => i / 2)
      result shouldBe range(1, 3)
    }

    "Convert every boolean in the list to its inverse" in {
      List(true, false, true).ownMap(b => !b) shouldBe List(false, true, false)
    }

    "Return every first element of a list" in {
      val list = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
      val result: List[Int] = list.ownMap(l => l.head)
      result should contain allOf(1, 4, 7)
    }

    "Return a list of booleans based on a list of characters, where false means whitespace, true on characters" in {
      val list = "Ik werk bij Sogyo".toCharArray.toList
      val result: List[Boolean] = list.ownMap({
        case ' ' => false
        case _ => true
      })
      result shouldBe List(true, true, false, true, true, true, true, false, true, true, true, false, true, true, true, true, true)
    }
  }
}
