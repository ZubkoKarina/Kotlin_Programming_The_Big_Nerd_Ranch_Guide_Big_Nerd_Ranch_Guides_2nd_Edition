import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = { it }

inline fun narrate(
    message: String,
    modifier: (String) -> String = { narrationModifier(it) }
) {
    println(modifier(message))
}

fun changeNarratorPersonality() {
    val personality: String
    val modifier: (String) -> String

    when (Random.nextInt(1..5)) {
        1 -> {
            personality = "loud"
            modifier = { message ->
                val numExclamationPoints = 3
                message.uppercase() + "!".repeat(numExclamationPoints)
            }
        }
        2 -> {
            personality = "tired"
            modifier = { message ->
                message.lowercase().replace(" ", "... ")
            }
        }
        3 -> {
            personality = "unsure"
            modifier = { message ->
                message.replace(".", "?") + "?"
            }
        }
        4 -> {
            var narrationsGiven = 0
            personality = "like sending an itemized bill"
            modifier = { message ->
                narrationsGiven++
                "$message (I have narrated $narrationsGiven things)"
            }
        }
        else -> {
            personality = "professional"
            modifier = { message ->
                message
            }
        }
    }

    narrationModifier = modifier
    narrate("The narrator begins to feel $personality")
}
