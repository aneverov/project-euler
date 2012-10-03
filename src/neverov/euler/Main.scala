package neverov.euler

import collection.immutable.HashMap
import neverov.euler.problems._

/**
 * User: A_Neverov
 * Date: 22.06.12
 * Time: 12:21
 */
object Main extends App {

  override def main(args: Array[String]) {
    Console.println("Enter problem number to solve: ")
    val problemNumber = Console.readLine().toInt
    Console.println("\nYou selected problem " + problemNumber)

    val problems = HashMap[Int, EulerProblem](
      1 -> new Problem1,
      2 -> new Problem2,
      3 -> new Problem3,
      4 -> new Problem4,
      5 -> new Problem5,
      6 -> new Problem6,
      9 -> new Problem9,
      13 -> new Problem13,
      14 -> new Problem14,
      45 -> new Problem45)
    val problem = problems.get(problemNumber)
    problem match {
      case Some(p) =>
        Console.println("\n" + p.description)
        Console.println("\nResult: " + p.solve)
      case None => Console.println("\nSolution to this problem is yet unknown")
    }
  }
}
