object Sorting {

  def findLowerValueFrom(list: Array[Int], index: Int = 0): Int = {
    def recursiveLowerValue(value: Int, index: Int): Int = {
      if(index < (list.length - 1)) {
        val currentValue = list(index)
        if(currentValue < value) {
          recursiveLowerValue(currentValue, index+1)
        } else recursiveLowerValue(value, index+1)
      } else value
    }
    recursiveLowerValue(list(index), index)
  }

  def sorting(list: Array[Int]) = {

    def recursiveSorting(currentList: Array[Int], sortedlist: Array[Int]): Array[Int] = {
      if(sortedlist.length < list.length) {
        val lowerValue = findLowerValueFrom(currentList)
        val otherValues = currentList.filterNot(v => v == lowerValue)
        val array = sortedlist.:+(lowerValue)
        recursiveSorting(otherValues, array)
      } else sortedlist
    }
    recursiveSorting(list, Array.emptyIntArray)
  }

  def main(args: Array[String]): Unit = {
    val list = Array(5,3,6,2,10)
    println(sorting(list).mkString)
  }

}
