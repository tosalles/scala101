package nl.sogyo.fp

object lists {
  def filterEvens(list: List[Int], result: List[Int]): List[Int] = {
    if(list.isEmpty) result.reverse
    else if(arithmetics.modulus(list.head, 2) == 0) filterEvens(list.tail, list.head :: result)
    else filterEvens(list.tail, result)
  }

  def filterEvensPatternMatching(list: List[Int]): List[Int] = list match {
    case head :: tail => {
      if (head % 2 == 0) {
        head :: filterEvensPatternMatching(tail)
      } else {
        filterEvensPatternMatching(tail)
      }
    }
    case Nil => List()
  }

  def length[A](list : List[A]) : Int = list match {
    case _ :: tail => 1 + length(tail)
    case Nil => 0
  }

  def findMax(list: List[Int]): Int = {
    findMax(list, 0)
  }

  private def findMax(list: List[Int], result: Int): Int = {
    if(list.isEmpty) result
    else if(list.head > result) findMax(list.tail, list.head)
    else findMax(list.tail, result)
  }

}
