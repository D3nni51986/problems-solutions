package cs.algorithms.dynamic.programming


/**The longest common subsequence (LCS) is the problem of finding the longest subsequence that
is present in given two sequences in the same order. i.e. find a longest sequence which can
be obtained from the first original sequence by deleting some items, and from the second original sequence by deleting other items**/
object LongestCommonSubSequence extends App{

  def maxLcsLength(x: String, y: String, m: Int, n: Int): Int = {
    if (m == 0 || n == 0){
      0
    }
    else if (x.charAt(m - 1) == y.charAt(n - 1)){
      maxLcsLength(x, y, m - 1, n - 1) + 1
    }
    else Integer.max(
      maxLcsLength(x, y, m - 1, n),
      maxLcsLength(x, y, m , n - 1)
    )
  }

  val x = "ABCBDAB"
  val y = "BDCABA"

  println(maxLcsLength(x, y, x.length, y.length))

}
