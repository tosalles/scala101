package nl.sogyo.fp._4

import nl.sogyo.fp._4_HigherOrderFunctions
import org.scalatest.{Matchers, WordSpec}

class ApplyTest extends WordSpec with Matchers with Range {

  "MyList with apply" should {
    "invoke a func value with two concrete parameters" in {
      val f = (x: String, y: Int) => s"$y: $x"
      _4_HigherOrderFunctions.apply(f, "hoi", 3) shouldBe "3: hoi"
    }
  }
}
