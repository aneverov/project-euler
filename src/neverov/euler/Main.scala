package neverov.euler

import neverov.euler.problems._

object Main extends App {

  override def main(args: Array[String]) {
    println("Enter problem number to solve: ")
    val problemNumber = readLine().toInt
    println(s"\nYou selected problem $problemNumber")

    val problems = Map(
      1 -> new Problem1,
      2 -> new Problem2,
      3 -> new Problem3,
      4 -> new Problem4,
      5 -> new Problem5,
      6 -> new Problem6,
      7 -> new Problem7,
      9 -> new Problem9,
      13 -> new Problem13,
      14 -> new Problem14,
      45 -> new Problem45
    )
    problems get problemNumber match {
      case Some(problem) =>
        println(s"\n${problem.description.stripMargin}")
        println(s"\nResult: ${problem.solve}")
      case None => println("\nSolution to this problem is yet unknown")
    }
  }
}
