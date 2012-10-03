package neverov.euler.problems

import neverov.euler.EulerProblem

/**
 * User: Neverrav
 * Date: 24.08.12
 * Time: 20:58
 */
class Problem6 extends EulerProblem{
  val description = "The sum of the squares of the first ten natural numbers is,\n" +
    "12 + 22 + ... + 102 = 385\nThe square of the sum of the first ten natural numbers is,\n" +
    "(1 + 2 + ... + 10)2 = 552 = 3025\nHence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.\n" +
    "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."

  val solved = true

  def solve = {
    val sumOfSquares = (BigInt(0) to BigInt(100)).map(i => i*i).sum
    val sum = (BigInt(0) to BigInt(100)).reduceLeft(_+_)
    val squareOfSum = sum*sum
    (squareOfSum - sumOfSquares).toString
  }
}
