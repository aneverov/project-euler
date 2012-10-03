package neverov.euler.problems

import neverov.euler.EulerProblem

/**
 * User: Neverrav
 * Date: 24.08.12
 * Time: 20:40
 */
class Problem5 extends EulerProblem {
  val description = "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.\n" +
    "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"

  val solved = true

  def solve: String ={

    def isDivisible(x: Int): Boolean = {
      (1 to 20).forall(x % _ == 0)
    }

    Stream.from(1).filter(x => isDivisible(x)).head.toString
  }
}
