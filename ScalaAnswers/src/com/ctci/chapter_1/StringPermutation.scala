package com.ctci.chapter_1

object StringPermutation {

  def isPermutation(a: String, b: String): Boolean = {

    // create a helper method to determine if a is a permutation of b or vice versa
    // find the shortest length or if both are the same size
    // check if it has a char that does not exist in the largest
    //  -> then it is not a permutation of the largest
    def _isPermutation(short: String, long: String): Boolean = {
      val c = short.charAt(0)

      // I was getting a MatchError.scala
      // the reason being was I was never reaching the true case as
      // the guard I was using was checking for "< 1" when the length was 1
      // meaning at that point a case was not being matched resulting in the error
      c match {
        case x if long.contains(x) && short.length <= 1 => true
        case x if long.contains(x) && short.length > 1 =>
          _isPermutation(short.substring(1), long.replaceFirst(x.toString, ""))
        case x if !long.contains(x) => false
      }
    }

    // pass the shortest one in first
    // make the strings lowercase so that it is not case sensitive
    if (a.length <= b.length) _isPermutation(a.toLowerCase, b.toLowerCase)
    else _isPermutation(b.toLowerCase, a.toLowerCase)
  }
}

object main1 extends App {
  val _a = "Legend"
  val _b = "I am Legend ;)"
  val _c = "Neo"

  println(StringPermutation.isPermutation(_a, _b))
  println(StringPermutation.isPermutation(_a, _c))

}