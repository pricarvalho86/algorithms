import scala.annotation.tailrec

object BinarySearch {

  def binarySearch(list: Array[Int], item: Int): Option[Int] = {
    def recursiveBinarySearch(low: Int, high: Int): Option[Int] = {
      val middlePosition = (low + high) / 2
      val positionValue = list(middlePosition)

      if(positionValue == item)
        Some(middlePosition)
      else if (low <= high) {
        if(positionValue > item) recursiveBinarySearch(low, high = (middlePosition - 1))
          else recursiveBinarySearch(low = (middlePosition + 1), high)
      } else None
    }
    recursiveBinarySearch(low = 0, high = (list.length - 1))
  }

  @tailrec
  def calculateLog(listSize: Int, iteractions: Int = 0): Int = {
    val result = listSize / 2
    if(result != 0)
      calculateLog(result, iteractions + 1)
    else iteractions
  }


  def main(args: Array[String]): Unit = {
    val list = Array(1,3,5,7,9)

    println(binarySearch(list, 3))
    println(binarySearch(list, -1))

    println(calculateLog(128))
    println(calculateLog(128 * 2))
  }

}
