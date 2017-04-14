package nl.sogyo.fp

object _4_HigherOrderFunctions {

  implicit class MyList[A](l: List[A]) {

    final def ownFilterImperative(f: A => Boolean): List[A] = List.empty

    final def ownFilter(f: A => Boolean): List[A] = List.empty

    final def ownMapImperative[B](f: A => B): List[B] = List.empty

    final def ownMap[B](f: A => B): List[B] = List.empty

    final def ownFoldLeft[B](acc: B)(fn: (B, A) => B): B = acc

    final def ownFoldRight[B](acc: B)(fn: (B, A) => B): B = acc
  }

  def apply[T, U, V](f: (T, U) => V, x: T, y: U): V = f(x, y)
}
