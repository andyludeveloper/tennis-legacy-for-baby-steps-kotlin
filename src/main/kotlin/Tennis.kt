class Tennis{
    private var secondPlayerScoreTimes = 0
    private var firstPlayerScoreTimes = 0

    private val firstPlayerName = "Joey"

    private val secondPlayerName = "Tom"

    fun score(): String? {
        val love = "love"
        val fifteen = "fifteen"
        val thirty = "thirty"
        val forty = "forty"
        val deuce = "deuce"
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 0) {
            return "$love all"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 0) {
            return "$fifteen $love"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 0) {
            return "$thirty $love"
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 0) {
            return "$forty $love"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 1) {
            return "$love $fifteen"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 2) {
            return "$love $thirty"
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 3) {
            return "$love $forty"
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 1) {
            return "$fifteen all"
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 2) {
            return "$thirty all"
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