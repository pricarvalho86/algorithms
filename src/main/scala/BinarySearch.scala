object BinarySearch {
  import scala.util.control.Breaks._

  def binarySearch(list: Array[Int], item: Int): Option[Int] = {
    var low = 0
    var high = list.length - 1

    var value = None
    breakable {
      while (low <= high) {
        var middle = (low + high) / 2
        val guess = list(middle)
        if (guess == item) {
          return Some(middle)
        }
        else if (guess > item) high = middle - 1
        else low = middle + 1
      }
    }
    value
  }


  def main(args: Array[String]): Unit = {
    val list = Array(1,3,5,7,9)

    println(binarySearch(list, 3))
    println(binarySearch(list, -1))
  }

}
