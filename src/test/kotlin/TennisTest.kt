import org.junit.Assert.*
import org.junit.Test

class TennisTest{
    private val tennis = Tennis()

    @Test
    fun love_all() {
        scoreShouldBe("love all")
    }

    @Test
    fun fifteen_love() {
        givenFirstPlayerScore(1)
        scoreShouldBe("fifteen love")
    }

    @Test
    fun thirty_love() {
        givenFirstPlayerScore(2)
        scoreShouldBe("thirty love")
    }

    @Test
    fun forty_love() {
        givenFirstPlayerScore(3)
        scoreShouldBe("forty love")
    }

    @Test
    fun love_fifteen() {
        givenSecondPlayerScore(1)
        scoreShouldBe("love fifteen")
    }

    @Test
    fun love_thirty() {
        givenSecondPlayerScore(2)
        scoreShouldBe("love thirty")
    }

    @Test
    fun love_forty() {
        givenSecondPlayerScore(3)
        scoreShouldBe("love forty")
    }

    @Test
    fun fifteen_all() {
        givenFirstPlayerScore(1)
        givenSecondPlayerScore(1)
        scoreShouldBe("fifteen all")
    }

    @Test
    fun thirty_all() {
        givenFirstPlayerScore(2)
        givenSecondPlayerScore(2)
        scoreShouldBe("thirty all")
    }

    @Test
    fun deuce() {
        givenDeuce()
        scoreShouldBe("deuce")
    }

    @Test
    fun first_player_adv() {
        givenDeuce()
        givenFirstPlayerScore(1)
        scoreShouldBe("Joey adv")
    }

    @Test
    fun second_player_adv() {
        givenDeuce()
        givenSecondPlayerScore(1)
        scoreShouldBe("Tom adv")
    }

    @Test
    fun second_player_win() {
        givenDeuce()
        givenSecondPlayerScore(2)
        scoreShouldBe("Tom win")
    }

    @Test
    fun first_player_win() {
        givenDeuce()
        givenFirstPlayerScore(2)
        scoreShouldBe("Joey win")
    }

    private fun givenDeuce() {
        givenFirstPlayerScore(3)
        givenSecondPlayerScore(3)
    }

    private fun givenSecondPlayerScore(times: Int) {
        for (i in 0 until times) {
            tennis.secondPlayerScore()
        }
    }

    private fun givenFirstPlayerScore(times: Int) {
        for (i in 0 until times) {
            tennis.firstPlayerScore()
        }
    }

    private fun scoreShouldBe(expected: String) {
        assertEquals(expected, tennis.score())
    }
}