package Narration
import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier = {message: String ->
    val numExclamationPoints = 3
    message.uppercase()+"!".repeat(numExclamationPoints)
}
fun narrate(message: String) {
    println(narrationModifier(message))
}
fun calculate(operation: (Int, Int) -> Int){
    val result = operation(5, 3)
    println("Result:  $result")
}
val loudNarration: (String, String) -> String = {
    message, tone ->
    when(tone) {
        "excited" -> {
            val numExclamationPoints = 3
            message.uppercase() + "!".repeat(numExclamationPoints)
        }
        "sneaky" -> {
            "$message. The nurrator has just blown Madrigal`s cover.".uppercase()
        }
        else -> message.uppercase()
    }
}
fun changeNarratorMood() {
    val mood: String
    val modifier: (String) -> String
    when (Random.nextInt(1..4)) {
        1 -> {
            mood = "loud"
            modifier = { message ->
                val numExclamationPoints = 3
                message.uppercase()
                "!".repeat(numExclamationPoints)
            }
        }
        2 -> {
            mood = "tired"
            modifier = { message ->
                message.lowercase().replace(" ",
                    "... ")
            }
        }
        3 -> {
            mood = "unsure"
            modifier = { message ->
                "$message?"
            }
        }
        else -> {
            mood = "professional"
            modifier = { message ->
                "$message."
            }
        }
    }
    narrationModifier = modifier
    narrate("The narrator begins to feel $mood")
}