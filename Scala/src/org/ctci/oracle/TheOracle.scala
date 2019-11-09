package org.ctci.oracle

import org.ctci.chapters.one.{StringPermutation, UniqueVerifier}

/**
  * Question represent the base type
  *
  * it defines two fields
  *   name -> the name of the question? in essence the question itself
  *   chapter -> the chapter the question comes from
  *
  * I want to have nested case statements that can print the chapter
  * then cycle through each question from that chapter
  */

trait Question {
  def name: String
  def chapter: String
  def answer: Unit
}

/**
  * This is to abstract the questions into there respective chapters
  */
// TODO: add functionality so that you can execute all of the questions within a chapter
trait ChapterOne extends Question {
  override def chapter = "Chapter ONE"
}

object TheOracle extends App {

  /**
    * function used to determine the question and produce the output
    * @param q
    */
  // TODO: structure the answers so that the output looks like 1. name, 2. chapter, 3. answer
  def enlighten(q: Question): Unit = {
    q match {
      case StringPermutation() =>
        println(s"${q.name} \n${q.chapter} \n${q.answer}\n")
      case UniqueVerifier() =>
        println(s"${q.name} \n${q.chapter} \n${q.answer}\n")
    }
  }

  enlighten(StringPermutation())
  enlighten(UniqueVerifier())

}