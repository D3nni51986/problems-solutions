package cs.algorithms

object PlusPlus extends App {

  def plusplus(arr:Array[Int]) = {

    val res = increment(arr.length - 1, arr, 1)

    println(res.toList)
  }

  def increment(index: Int, arr:Array[Int], curry: Int): Array[Int] = {
    if (index > 0){
      if (arr(index) + curry == 10){
        arr(index) = 0
        increment(index - 1, arr, 1)
      }
      else{
        arr(index) = arr(index) + curry
        increment(index - 1, arr, 0)
      }
    }
    else{
      if (arr(index) + curry == 10){
        arr(index) = 0
        (1::arr.toList).toArray
      }
      else{
        arr(index) = arr(index) + curry
        arr
      }
    }
  }

  plusplus(Array(9,9,9,9,9))

  println(pushZeroRight(Array(1,0,2,0,0,0,4,2,2,0,4,5)).toList)

  def pushZeroRight(arr:Array[Int]) = {
    var left = 0
    var i = 0
    for (x <- arr){
      if (x != 0){
        arr(left) = x
        left += 1
      }
      i+=1
    }
    for (j <- left until arr.size){
      arr(j) = 0
    }
    arr
  }

}
