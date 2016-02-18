package nl.sogyo.fp

object lists {
  def filterEvens(list: List[Int], result: List[Int]): List[Int]

  def filterEvensPatternMatching(list: List[Int]): List[Int]

  def length[A](list : List[A]) : Int

  def findMax(list: List[Int]): Int

  private def findMax(list: List[Int], result: Int): Int
}
