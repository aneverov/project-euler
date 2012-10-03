package neverov.euler.problems

import neverov.euler.EulerProblem

/**
 * User: A_Neverov
 * Date: 22.06.12
 * Time: 12:25
 */
class Problem1 extends EulerProblem {
  val description = "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n" +
    "Find the sum of all the multiples of 3 or 5 below 1000."

  val solved = true

  def solve: String = {
    (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).reduceLeft(_+_) toString
  }
}
