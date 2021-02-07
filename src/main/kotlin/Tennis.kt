import kotlin.math.abs

class Tennis {
    private var secondPlayerScoreTimes = 0
    private var firstPlayerScoreTimes = 0

    private val firstPlayerName = "Joey"

    private val secondPlayerName = "Tom"

    private val scoreMap: Map<Int, String> = mapOf(
        0 to "love",
        1 to "fifteen",
        2 to "thirty",
        3 to "forty"
    )

    fun score(): String {
        val deuce = "deuce"
        if (isSameScore()) {
            if (isDeuce()) {
                return deuce
            }
            return sameScore()
        }
        if (isLookupScore()) {
            return lookupScore()
        }

        if (abs(firstPlayerScoreTimes - secondPlayerScoreTimes) == 1) {
            return "${advPlayer()} adv"
        }

        return "${advPlayer()} win"
    }

    private fun advPlayer(): String {
        val advPlayer = if (firstPlayerScoreTimes > secondPlayerScoreTimes) {
            firstPlayerName
        } else
            secondPlayerName
        return advPlayer
    }

    private fun isLookupScore() = firstPlayerScoreTimes < 4 && secondPlayerScoreTimes < 4

    private fun isSameScore() = firstPlayerScoreTimes == secondPlayerScoreTimes

    private fun isDeuce() = firstPlayerScoreTimes >= 3

    private fun sameScore() = "${scoreMap[firstPlayerScoreTimes]} all"

    private fun lookupScore() = "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}