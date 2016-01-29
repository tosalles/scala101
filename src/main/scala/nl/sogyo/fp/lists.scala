package nl.sogyo.fp

import scala.collection.mutable.ArrayBuffer

object lists {
  def filterEvens(list: ArrayBuffer[Int], result: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    if(list.length == 0)                 result
    else if(arithmetics.modulus(list.head, 2) == 0) filterEvens(list.tail, result += list.head)
    else                                 filterEvens(list.tail, result)
  }
}
