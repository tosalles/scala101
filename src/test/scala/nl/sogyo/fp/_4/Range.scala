package nl.sogyo.fp._4

trait Range {
  /**
    * Inclusive range of D[x, y]
    *
    * @example range(0, 3) == List(0, 1, 2, 3)
    * @param x start
    * @param y stop
    * @return
    */
  def range(x: Int, y: Int): List[Int] = List.range(x, y + 1)
}
