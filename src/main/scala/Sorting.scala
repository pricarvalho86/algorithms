import scala.annotation.tailrec

object Sorting {

  def findLowerValueFrom(list: Array[Int], index: Int = 0): Int = {
    @tailrec
    def recursiveLowerValue(value: Int, index: Int): Int = {
      if(index < list.length) {
        val nextValue = list(index)
        if (nextValue < value) recursiveLowerValue(nextValue, index + 1)
          else recursiveLowerValue(value, index + 1)
       }else value
    }
    recursiveLowerValue(list(index), index+1)
  }

  def sorting(list: Array[Int]) = {
    @tailrec
    def recursiveSorting(currentList: Array[Int], sortedlist: Array[Int]): Array[Int] = {
      if(sortedlist.length < list.length) {
        val lowerValue = findLowerValueFrom(currentList)
        val i = currentList.indexOf(lowerValue)
        val otherValues = currentList.zipWithIndex.filterNot(_._2 == i).map(_._1)
        val array = sortedlist.:+(lowerValue)
        recursiveSorting(otherValues, array)
      } else sortedlist
    }
    recursiveSorting(list, Array.emptyIntArray)
  }

  def main(args: Array[String]): Unit = {
    val list = Array(5,3,6,2,10,1,1)

    println(sorting(list).mkString(","))
  }

}
