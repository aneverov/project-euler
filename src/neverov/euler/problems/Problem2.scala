package neverov.euler.problems

import neverov.euler.EulerProblem

/**
 * User: A_Neverov
 * Date: 22.06.12
 * Time: 17:04
 */
class Problem2 extends EulerProblem {

  val description = "Each new term in the Fibonacci sequence is generated by adding the previous two terms. \n" +
    "By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... \n" +
    "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."

  val solved = true

  def solve: String = {
    def fibonacci: Stream[Long] = {
      def fib(f0: Long, f1: Long): Stream[Long] = {
        f0 #:: fib(f1, f0+f1)
      }

      fib(0, 1)
    }

    fibonacci.filter(_ % 2 == 0).takeWhile(_ < 4000000L).reduceLeft(_+_) toString
  }
}
