package nl.sogyo.fp

object HigherOrderFunctions {
  implicit class myList[A](l: List[A]) {

    def ownFilter(f: A => Boolean): List[A] = List[A]()

    def ownMap[B](f: A => B): List[B] = List[B]()
  }

  def apply(function: (Int, Int) => Int, x: Int, y: Int): Int = 0
}
