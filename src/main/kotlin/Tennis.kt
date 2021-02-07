class Tennis{
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
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 0) {
            return "${scoreMap[firstPlayerScoreTimes]} all"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 0) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 0) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 0) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 1) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 2) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 3) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 1) {
            return "${scoreMap[firstPlayerScoreTimes]} all"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 2) {
            return "${scoreMap[firstPlayerScoreTimes]} all"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 3) {
            return deuce
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 4) {
            return deuce
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

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}