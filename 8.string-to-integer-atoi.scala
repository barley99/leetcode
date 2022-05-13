/*
 * @lc app=leetcode id=8 lang=scala
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
import java.lang.StringBuilder

sealed abstract class AtoiState extends Product with Serializable {
    def memory: StringBuilder
}

object AtoiState {
    case class Start() extends AtoiState
    case class Space() extends AtoiState
    case class Sign() extends AtoiState
    case class Digit() extends AtoiState
    case class NonDigit() extends AtoiState
    case class Stop() extends AtoiState

    def atoiProcess(state: AtoiState, input: String, memory: String = ""): Int = state match {
        case Start() => ???

    }
}

object Solution {
    def myAtoi(s: String): Int = {

    }
}
// @lc code=end
