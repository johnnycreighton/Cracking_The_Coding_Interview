package org.ctci.chapters.one

import org.ctci.oracle.{ChapterOne, Question}

/**
  * can only have one case class in the hierarchy
  */

// write a method to replace all spaces in a String with '%20'
final case class URLify() extends ChapterOne {

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

  override def name: String = ???

  override def answer(): Unit = ???
}
