package neverov.euler.problems

import neverov.euler.EulerProblem

class Problem4 extends EulerProblem {
  val description = "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.\n" +
    "Find the largest palindrome made from the product of two 3-digit numbers."

  val solved = true

  def solve: String = {
    def isPalindrome(n: Int): Boolean = {
      val str = n.toString

      val firstHalf = str substring(0, str.length / 2)
      val secondHalf = str substring (str.length / 2)

      firstHalf.reverse == secondHalf
    }

    val palindromes =
      for {
        i <- 100 until 1000
        j <- 100 until 1000 if isPalindrome(i*j)
      } yield i*j

    palindromes.max.toString
  }
}
