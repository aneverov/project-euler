package neverov.euler.problems

import neverov.euler.EulerProblem
import collection.immutable.HashMap
import scala.collection
import scala.collection

/**
 * User: Neverrav
 * Date: 24.06.12
 * Time: 18:26
 */
class Problem14 extends EulerProblem {
  val description = "The following iterative sequence is defined for the set of positive integers:\n" +
    "n  n/2 (n is even)\n" +
    "n  3n + 1 (n is odd)\n" +
    "Using the rule above and starting with 13, we generate the following sequence:\n" +
    "13  40  20  10  5  16  8  4  2  1\n" +
    "It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.\n" +
    "Which starting number, under one million, produces the longest chain?"

  val solved = false

  def solve: String = {
    def seq(start: Int) = Iterator.iterate(start){i: Int => if (i%2 == 0) i/2 else 3*i+1}.takeWhile(_ != 1)

    def sequence(start: Int): List[Int] = {
      var list = List[Int]();
      list
      //list ++= start
      //if (start != 1) {
      //  list ++ sequence( if (_%2 == 0) _/2 else 3*_+1)
      //}
      //list
    }

    println(seq(113383).length)

    var result = (0, 0)
    for (i <- (1 to 1000000)) {
      if (i > 113380) println("processing i=" + i)
      val length = seq(i).length + 1

      if (length > result._2) {
        Console.println("New biggest result: (" + i +", " + length + ")")
        result = (i, length)
      }
    }
    result._1 toString
  }
}
