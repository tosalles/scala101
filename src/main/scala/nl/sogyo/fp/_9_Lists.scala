package nl.sogyo.fp

import scala.annotation.tailrec

object _9_Lists {

  def filterEvens(list: List[Int]): List[Int] = {
    if (list.isEmpty) List.empty
    else if (_5b_Arithmetics.modulus(list.head, 2) == 0) list.head :: filterEvens(list.tail)
    else filterEvens(list.tail)
  }

  def filterEvensPatternMatching(list: List[Int]): List[Int] = list match {
    case head :: tail if head % 2 == 0 => head :: filterEvensPatternMatching(tail)
    case _ :: tail => filterEvensPatternMatching(tail)
    case Nil => List.empty
  }

  def length[A](list: List[A]): Int = list match {
    case _ :: tail => 1 + length(tail)
    case Nil => 0
  }

  def listLength[A](list: List[A]): Int = listLength(list, 0)

  @tailrec private def listLength[A](list: List[A], result: Int): Int = list match {
    case Nil => result
    case head :: tail => listLength(tail, result + 1)
  }

  def findMax(list: List[Int]): Int = findMax(list, 0)

  @tailrec private def findMax(list: List[Int], result: Int): Int = list match {
    case head :: tail if head > result => findMax(tail, head)
    case _ :: tail => findMax(tail, result)
    case Nil => result
  }

}