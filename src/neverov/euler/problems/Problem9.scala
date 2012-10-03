package neverov.euler.problems

import neverov.euler.EulerProblem

/**
 * User: Neverrav
 * Date: 23.06.12
 * Time: 20:26
 */
class Problem9 extends EulerProblem {
  val description = "A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,\n" +
    "a2 + b2 = c2\nFor example, 32 + 42 = 9 + 16 = 25 = 52.\n" +
    "There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n" +
    "Find the product abc."

  val solved = true

  def solve: String = {
    def pythagorean(a: Int, b: Int, c: Int): Boolean = {
      return a * a + b * b == c * c
    }

    def clause(a: Int, b: Int, c: Int): Boolean = {
      return a + b + c == 1000
    }

    var a = 0
    var b = 0
    var c = 0
    for (ai <- (1 to 1000); bi <- (1 to 1000); ci <- (1 to 1000)) {
      if (pythagorean(ai, bi, ci) && clause(ai, bi, ci)) {
        a = ai
        b = bi
        c = ci
      }
    }

    a*b*c toString
  }
}
