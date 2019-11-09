package org.ctci.chapters.one

import org.ctci.oracle.{ChapterOne, Question}

/**
  * Determine if a string has only unique chars
  * What if you cannot use addition data structures
  */

final case class UniqueVerifier() extends ChapterOne {

  override val name: String = "Unique Verifier"

  def isUnique(s: String): Boolean = {

    // use a helper function to avoid implementing the question the imperative way (OOP)
    def _isUnique(original: String, accumulator: String): Boolean = {

      // get the first character of original
      val c = original.charAt(0)

      // use pattern matching to check if accumulator contains c
      // using an if within a case is known as a guard in scala
      c match {
        case c if accumulator.contains(c) => false
        case c if !accumulator.contains(c) && original.length > 1 =>
          _isUnique(original.substring(1), accumulator + c) // recursive call
        case c => true // if the code reaches this point it must be unique ...?
      }
    }

    // call the helper method with the param s and an empty string for the accumulator
    _isUnique(s, "")
  }

  override def answer(): Unit = {
    val uniqueString = "abcdefghijklmnopqrstuvwxyz"
    val nonUniqueString = "abcdeabcde"

    println(this.isUnique(uniqueString))
    println(this.isUnique(nonUniqueString))
  }
}