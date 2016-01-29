package nl.sogyo.fp

object lists {
  def filterEvens(list: List[Int], result: List[Int]): List[Int] = {
    if(list.length == 0) result.reverse
    else if(arithmetics.modulus(list.head, 2) == 0) filterEvens(list.tail, list.head :: result)
    else filterEvens(list.tail, result)
  }
}
