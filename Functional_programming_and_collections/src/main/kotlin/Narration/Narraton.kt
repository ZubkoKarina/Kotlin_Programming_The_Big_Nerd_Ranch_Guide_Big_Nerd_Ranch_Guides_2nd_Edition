package Narration

val narrationModifier = {message: String ->
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