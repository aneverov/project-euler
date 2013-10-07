package neverov.euler.problems

import neverov.euler.EulerProblem

class Problem3 extends EulerProblem {
  val description = "The prime factors of 13195 are 5, 7, 13 and 29.\nWhat is the largest prime factor of the number 600851475143 ?"

  val solved = true

  def solve: String = {
    var limit = 600851475143L

    lazy val primes: Stream[Long] =
      Stream.cons(2, primes.map(x => {
        var tmp = x
        while ((limit % tmp) != 0 && limit != 1) {
          tmp = tmp + 1
        }
        limit = limit / tmp
        tmp
      }))
    primes.take(10).last.toString
  }
}
