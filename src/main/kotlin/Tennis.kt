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

    fun score(): String? {
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
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 3) {
            return "$firstPlayerName adv"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 4) {
            return "$secondPlayerName adv"
        }
        if (firstPlayerScoreTimes == 5 && secondPlayerScoreTimes == 3) {
            return "$firstPlayerName win"
        }
        return if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 5) {
            "$secondPlayerName win"
        } else null
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