package nl.sogyo.fp

object higherOrder {

  implicit class myList[A](l: List[A]) {

    def ownFilter(f: A => Boolean): List[A] = {
      var result: List[A] = List[A]()
      for(element <- this.l) {
        if (f(element)) {
          result = result :+ element
        }
      }
      result
    }

    def ownMap[B](f: A => B): List[B] = {
      var result: List[B] = List[B]()
      for(element <- this.l) {
        result = result :+ f(element)
      }
      result
    }
  }

  def apply(function: (Int, Int) => Int, x: Int, y: Int): Int = {
    function(x, y)
  }
}
