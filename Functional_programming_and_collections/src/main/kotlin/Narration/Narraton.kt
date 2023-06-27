package Narration
import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = { it }
inline fun narrate(
    message: String,
    modifier: (String) -> String = {
    narrationModifier(it) }
) {
    println(narrationModifier(message))
    println(modifier(message))
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
    when (Random.nextInt(1..10)) {
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
        4 -> {
            var narrationsGiven = 0
            mood = "like sending an itemized bill"
            modifier = { message ->
                narrationsGiven++
                "$message.\n(I have narrated $narrationsGiven things)"
            }
        }
        5 -> {
            mood = "lazy"
            modifier = { message ->
                "Lazy mood, ${message.take(message.length/2)}"
            }
        }
        6 -> {
            mood = "mysterious"
            modifier = { message ->
                "Mysterious mood, ${message.replace(Regex("[LET]")){matchResult -> 
                    when (matchResult.value){
                        "L" -> "1"
                        "E" -> "3"
                        "T" -> "7"
                    else -> matchResult.value
                    } 
                }}"
            }
        }
        7 -> {
            mood = "poetic"
            modifier = { message: String ->
                "Poetic mood, ${message.replace(Regex(" "), { " ".repeat(Random.nextInt(1, 11)) })}"
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
fun createTitle(name: String): String{
    return when{
        name.equals(name.reversed(), ignoreCase = true) -> "The Palindrome Bearer"
        name.count{it.isLetter()} > 6 -> "The Extensive"
        name.all{it.isUpperCase()} -> "The Outstanding"
        name.count{it.lowercase() in "aeiou"} > 4 -> "The Master of Vowel"
        else -> "The Renowned Hero"
    }
}