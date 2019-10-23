package com.ctci.chapter_1

// write a method to replace all spaces in a String with '%20'
object URLify {

  def doIt(s: String): String = {

    def _doIt(original: String, urlified: String): String = {
      val c = original.charAt(0)

      c match {
        case x if x == " " => _doIt(original.substring(1), urlified + "%20")
        case x if original.length <= 1 => urlified + x
      }
    }

    _doIt(s, "")
  }
}
