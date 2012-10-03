package neverov.euler

/**
 * Created with IntelliJ IDEA.
 * User: Neverrav
 * Date: 23.06.12
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
abstract class EulerProblem {
  val solved: Boolean
  val description: String
  def solve: String
}
