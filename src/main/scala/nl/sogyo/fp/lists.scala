package nl.sogyo.fp

object lists {
  def filterEvens(list: List[Int], result: List[Int]): List[Int] = {
    if(list.isEmpty) result.reverse
    else if(arithmetics.modulus(list.head, 2) == 0) filterEvens(list.tail, list.head :: result)
    else filterEvens(list.tail, result)
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
