package Narration

fun narrate(
    message: String
) {
    println({
        val narrationModifier: () -> String = {
            val numExclamationPoints = 3
            message.uppercase() + "!".repeat(numExclamationPoints)
        }
        narrationModifier()
    }())
}