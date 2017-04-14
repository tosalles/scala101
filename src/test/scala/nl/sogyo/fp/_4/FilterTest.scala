package nl.sogyo.fp._4

import nl.sogyo.Range
import nl.sogyo.fp._4_HigherOrderFunctions.MyList
import org.scalatest.{Matchers, WordSpec}

class FilterTest extends WordSpec with Matchers with Range {

  def isEven(n: Int): Boolean = n % 2 == 0

  "MyList with ownFilterImperative" should {
    "Create a filter function on a list to test if it contains an even number" in {
      MyList(range(1, 10)).ownFilterImperative(isEven) should contain allOf(2, 4, 6, 8, 10)
    }
    "Filter strings containing a lowercase e" in {
      val res = MyList(List("pear", "xtzh", "SEsrb")).ownFilterImperative(s => s.contains("e"))
      res should contain ("pear")
    }
  }

  "MyList with ownFilter" should {
    "Create a filter function on a list to test if it contains an even number" in {
      MyList(range(1, 10)).ownFilterImperative(isEven) should contain allOf(2, 4, 6, 8, 10)
    }
    "Filter strings containing a lowercase e" in {
      val res = MyList(List("pear", "xtzh", "SEsrb")).ownFilterImperative(s => s.contains("e"))
      res should contain ("pear")
    }
  }
}
