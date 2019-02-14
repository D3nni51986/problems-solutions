package cs.algorithms

object EliminateBandAC extends App{

  val input = "asdbcas"

  eliminateA_BC(input)

  def eliminateA_BC(input: String) = {
    var inputArr = input.toArray
    var dropN = 0
    var bcSequence = 0
    var i = 0
    var originalIndex = 0
    while (i < inputArr.length){
      while (i < inputArr.length && inputArr(i) == 'a'){
        i += 1
      }

      while (i < inputArr.length && i + 1 < inputArr.length && inputArr(i) == 'b' && inputArr(i+1) == 'c'){
        i += 2
      }
      inputArr(originalIndex) = inputArr(i)
      originalIndex += 1
      i += 1
    }
    inputArr = inputArr.dropRight(i - originalIndex)
    println("")
  }

}
