package nl.sogyo.fp

object _5_HigherOrderFunctions {

  implicit class MyList[A](l: List[A]) {

    final def ownFilterImperative(f: A => Boolean): List[A] = {
      var result: List[A] = List[A]()
      for (element <- this.l) {
        if (f(element)) {
          result = result :+ element
        }
      }
      result
    }

    final def ownFilter(f: A => Boolean): List[A] = l match {
      case head :: tail =>
        if (f(head)) {
          head :: tail.ownFilter(f)
        } else {
          tail.ownFilter(f)
        }
      case Nil => List.empty
    }

    final def ownMapImperative[B](f: A => B): List[B] = {
      var result: List[B] = List.empty
      for (element <- this.l) {
        result = result :+ f(element)
      }
      result
    }

    final def ownMap[B](f: A => B): List[B] = l match {
      case head :: tail => f(head) :: tail.ownMap(f)
      case Nil => List.empty
    }

    final def ownFoldLeft[B](acc: B)(fn: (B, A) => B): B = l match {
      case head :: tail => tail.ownFoldLeft(fn(acc, head))(fn)
      case Nil => acc
    }

    final def ownFoldRight[B](acc: B)(fn: (B, A) => B): B = l match {
      case head :: tail => fn(tail.ownFoldRight(acc)(fn), head)
      case Nil => acc
    }

  }

  def apply[T, U, V](f: (T, U) => V, x: T, y: U): V = f(x, y)
}
