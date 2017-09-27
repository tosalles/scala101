package nl.sogyo.stocks

import nl.sogyo.Range
import org.scalatest.{Matchers, WordSpec}

class _3_StreamOpsTest extends WordSpec with Matchers with Range {
  "Stream operations" should {
    "merge streams containing numbers" in {
      val a = range(1, 9).toStream
      val b = range(11, 20).toStream
      StreamOps.merge(a, b).sum shouldBe 200
    }
  }
}
