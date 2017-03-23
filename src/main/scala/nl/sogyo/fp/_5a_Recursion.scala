package nl.sogyo.fp

import scala.annotation.tailrec

object _5a_Recursion {
  def simpleSum(first: Long, last: Long): Long = {
    if (first == last) {
      first
    } else {
      first + simpleSum(first + 1, last)
    }
  }

  def tailRecurseSum(first: Long, last: Long): Long = {
    @tailrec def tailRecurseHelper(first: Long, last: Long, partialSum: Long): Long = {
      if (first == last) first + partialSum else tailRecurseHelper(first + 1, last, first + partialSum)
    }
    tailRecurseHelper(first, last, 0)
  }
}
