package nl.sogyo.fp

object HigherOrderFunctions {

  implicit class myList[A](l: List[A]) {

    def ownFilterImperative(f: A => Boolean): List[A] = {
      var result: List[A] = List[A]()
      for (element <- this.l) {
        if (f(element)) {
          result = result :+ element
        }
      }
      result
    }

    def ownFilter(f: A => Boolean): List[A] = l match {
      case head :: tail => {
        if (f(head)) {
          head :: tail.ownFilter(f)
        } else {
          tail.ownFilter(f)
        }
      }
      case Nil => List()
    }

    def ownMapImperative[B](f: A => B): List[B] = {
      var result: List[B] = List[B]()
      for (element <- this.l) {
        result = result :+ f(element)
      }
      result
    }

    def ownMap[B](f: A => B): List[B] = l match {
      case head :: tail => f(head) :: tail.ownMap(f)
      case Nil => List()
    }
  }

  def apply(function: (Int, Int) => Int, x: Int, y: Int): Int = {
    function(x, y)
  }
}
