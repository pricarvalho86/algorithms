object BinarySearch {

  def recursiveBinarySearch(list: Array[Int], item: Int): Option[Int] = {
    def binarySearch(low: Int, high: Int): Option[Int] = {
      val middlePosition = (low + high) / 2
      val positionValue = list(middlePosition)

      if(positionValue == item)
        Some(middlePosition)
      else if (low <= high) {
        if(positionValue > item) binarySearch(low, high = (middlePosition - 1))
          else binarySearch(low = (middlePosition + 1), high)
      } else None
    }
    binarySearch(low = 0, high = (list.length - 1))
  }


  def main(args: Array[String]): Unit = {
    val list = Array(1,3,5,7,9)

    println(recursiveBinarySearch(list, 3))
    println(recursiveBinarySearch(list, -1))
  }

}
