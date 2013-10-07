package neverov.euler.problems

import neverov.euler.EulerProblem
import Stream._
import scala.language.postfixOps

class Problem7 extends EulerProblem{
  val solved: Boolean = false
  val description: String = "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.\n\nWhat is the 10 001st prime number?"

  def solve: String = {
    def sieve(numbers: Stream[Int]): Stream[Int] = {
      cons(numbers.head,
        sieve(numbers.tail filter (_ % numbers.head != 0)))
    }

    sieve(2 #:: from(3, 2)).take(10001).last.toString
  }
}
