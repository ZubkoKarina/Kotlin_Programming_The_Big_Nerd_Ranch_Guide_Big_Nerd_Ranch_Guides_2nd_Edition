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

fun calculate(operation: (Int, Int) -> Int){
    val result = operation(5, 3)
    println("Result:  $result")
}