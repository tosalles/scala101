package nl.sogyo.fp

object _5_HigherOrderFunctions {

  implicit class MyList[A](l: List[A]) {

    final def ownFilterImperative(f: A => Boolean): List[A] = ???

    final def ownFilter(f: A => Boolean): List[A] = ???

    final def ownMapImperative[B](f: A => B): List[B] = ???

    final def ownMap[B](f: A => B): List[B] = ???

    final def ownFoldLeft[B](acc: B)(fn: (B, A) => B): B = ???

    final def ownFoldRight[B](acc: B)(fn: (B, A) => B): B = ???
  }

  def apply[T, U, V](f: (T, U) => V, x: T, y: U): V = f(x, y)
}
