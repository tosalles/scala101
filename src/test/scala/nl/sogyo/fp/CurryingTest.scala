package nl.sogyo.fp

import org.scalatest.{Matchers, WordSpec}

class CurryingTest extends WordSpec with Matchers {
  "Currying" should {
    "bind values in sumCurry" in {
      val firstBound = Currying.sumCurry(3)
      val secondBound = firstBound(2)
      val finalBound = secondBound(1)
      finalBound shouldBe 6
      secondBound(0) shouldBe 5
      firstBound(0)(0) shouldBe 3
    }
    "bind values in sumCurryTwo" in {
      val firstBound = Currying.sumCurryTwo(3) _
      val secondBound = firstBound(2)
      val finalBound = secondBound(1)
      finalBound shouldBe 6
      secondBound(0) shouldBe 5
      firstBound(0)(0) shouldBe 3
    }
  }
}
