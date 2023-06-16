const val  HERO_NAME = "Madrigal"
fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)
    if(playerLevel in 1..3){
        println("Meet Mr. Bubbles n the land of soft things.")
    } else {
        println("Locale the enchanted sword.")
    }
    println("Time passes...")
    println("The hero returns from her quest.")

    val quest: String = when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBar
            if (canTalkToBarbarians) {
                "Embark on a quest to negotiate with the Barbarians."
            } else {
                "Locate the enchanted sword."
            }
        }
        else -> "Explore new territories."
    }
}
/*
* control flow - поток выполнния
* && - и
* || - или
* .. - интервал
* in - проверка наличия значений в интервале
*
*
* */