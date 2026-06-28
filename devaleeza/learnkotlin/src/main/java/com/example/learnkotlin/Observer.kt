package com.learning.learnkotlin

typealias Score = Pair<Int, Int>

// 1. Subject Abstract Class
abstract class Subject {
    private val observers: MutableList<MatchObserver> = mutableListOf()
    fun attach(observer: MatchObserver) = observers.add(observer)
    fun detach(observer: MatchObserver) = observers.remove(observer)
    protected fun onUpdate() = observers.forEach { it.update() }
}

// 2. Concrete Subject (Game Class)
class MatchGame : Subject() {
    var score: Score = 0 to 0
        private set(value) {
            field = value
            onUpdate()
        }

    fun onFirstTeamScores() {
        score = score.copy(first = score.first + 1)
    }

    fun onSecondTeamScores() {
        score = score.copy(second = score.second + 1)
    }
}

// 3. Observer Interface
interface MatchObserver {
    fun update()
}

// 4. Concrete Observer A: Score Announcer
class MatchScoreAnnouncer(private val game: MatchGame) : MatchObserver {
    init {
        game.attach(this)
    }

    override fun update() {
        val (first, second) = game.score
        println("The score is currently $first to $second.")
    }
}

// 5. Concrete Observer B: Leading Team Announcer
class MatchLeadingTeamAnnouncer(private val game: MatchGame) : MatchObserver {
    init {
        game.attach(this)
    }

    override fun update() {
        val (first, second) = game.score
        val announcement = when {
            first > second -> "First team is leading!"
            second > first -> "Second team is leading!"
            else -> "The game is currently tied."
        }
        println(announcement)
    }
}

// 6. Main Function (Single File Entry Point)
fun main() {
    println("=== Observer Pattern Match Demo ===")
    val game = MatchGame()

    // Observers ko attach karna
    val scoreAnnouncer = MatchScoreAnnouncer(game)
    val leadingAnnouncer = MatchLeadingTeamAnnouncer(game)

    // Match ka score chalana
    println("\n--- First Team Scores ---")
    game.onFirstTeamScores()

    println("\n--- Second Team Scores ---")
    game.onSecondTeamScores()

    println("\n--- Second Team Scores Again ---")
    game.onSecondTeamScores()
}