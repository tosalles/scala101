package nl.sogyo.fp

object _4_HigherOrderFunctions {

  implicit class MyList[A](l: List[A]) {

    def ownFilterImperative(f: A => Boolean): List[A] = List.empty

    def ownFilter(f: A => Boolean): List[A] = List.empty

    def ownMapImperative[B](f: A => B): List[B] = List.empty

    def ownMap[B](f: A => B): List[B] = List.empty

    def ownFoldLeft[B](acc: B)(fn: (B, A) => B): B = acc

    def ownReverse: List[A] = List.empty

    def ownFoldRight[B](acc: B)(fn: (B, A) => B): B = acc

  }

  def apply(f: (Int, Int) => Int, x: Int, y: Int): Int = f(x, y)
}
