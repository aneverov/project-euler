package neverov.euler

trait EulerProblem {
  val solved: Boolean
  val description: String
  def solve: String
}
