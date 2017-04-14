package nl.sogyo.fp._4

import nl.sogyo.Range
import nl.sogyo.fp._4_HigherOrderFunctions.MyList
import org.scalatest.{Matchers, WordSpec}

class FoldTest extends WordSpec with Matchers with Range {

  "MyList with own foldLeft" should {
    "fold left on a small list" in {
      val list: MyList[String] = List("a", "b", "c")
      list.ownFoldLeft("")((a, e) => a + e) shouldBe "abc"
    }
    "fold left on a huge list" in {
      val list: MyList[Int] = range(1, 100000)
      list.ownFoldLeft(0)((a, e) => a + e) shouldBe 705082704
    }
  }

  "MyList with own foldRight" should {
    "fold right on a small list" in {
      val list: MyList[String] = List("a", "b", "c")
      list.ownFoldRight("")((a, e) => a + e) shouldBe "cba"
    }
    "fold right on a huge list" in {
      val list: MyList[Int] = range(1, 100000)
      intercept[StackOverflowError] {
        list.ownFoldRight(0)((a, e) => a + e)
      }
    }
  }
}
