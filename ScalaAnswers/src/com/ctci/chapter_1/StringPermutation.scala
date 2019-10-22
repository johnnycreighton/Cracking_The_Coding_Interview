package com.ctci.chapter_1

object StringPermutation {

  def isPermutation(a: String, b: String): Boolean = {

    // create a helper method to determine if a is a permutation of b or vice versa
    // find the shortest length or if both are the same size
    // check if it has a char that does not exist in the largest
    //  -> then it is not a permutation of the largest
    def _isPermutation(short: String, long: String): Boolean = {
      val c = short.charAt(0)

      println(c)

      c match {
        case x if long.contains(x) && short.length > 1 =>
          _isPermutation(short.substring(1), long)
        case x if !long.contains(x) => false
        case x if long.contains(x) && short.length < 1 => true
      }
    }

    // pass the shortest one in first
    // make the strings lowercase so that it is not case sensitive
    if (a.length <= b.length) _isPermutation(a.toLowerCase, b.toLowerCase)
    else _isPermutation(b.toLowerCase, a.toLowerCase)
  }
}

object main_ extends App {
  val _a = "Legend"
  val _b = "I am Legend"

  println(StringPermutation.isPermutation(_a, _b))

}
