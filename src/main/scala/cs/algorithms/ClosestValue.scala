package cs.algorithms

/**** Given an array of sorted integers and find the closest value to the given number. Array may contain duplicate values and negative numbers.
      Example : Array : -10,2,5,6,7,8,8,9
      Target number : 5
      Output : 5

      Target number : 11
      Output : 9

      Target Number : 4
      Output : 5
  *****/
object ClosestValue extends App{


  val arr = Array(-10,-6,-4,1,2,3,4,5,6,100)

  println(findClosest(-4,arr))


  def findClosest(target: Int, array: Array[Int]): Int = {

    def findClosesHelper(minDif: Int, currentClosest: Int, l: Int, r: Int): Int ={
      val mid = (r + l)/2
      val currentDiff = Math.abs(target - array(mid))
      val newVals = currentDiff < minDif match {
        case true => (currentDiff, array(mid))
        case _    => (minDif, currentClosest)
      }
      if (array(l) == target){
        array(l)
      }
      else if (array(r) == target){
        array(r)
      }
      else if (array(mid) == target){
        array(mid)
      }
      else if (l == r){
        newVals._2
      }
      else if (array(mid) >= target){
        findClosesHelper(newVals._1, newVals._2, l, mid)
      }
      else {
        findClosesHelper(newVals._1, newVals._2, mid + 1, r)
      }
    }

    if (array.isEmpty){
      -1
    }
    else if (target <= array(0)){
      array(0)
    }
    else if (target >= array.last){
      array.last
    }
    else{
      findClosesHelper(Math.abs(target - array(0)), array(0), 0, array.length-1)
    }
  }
}
