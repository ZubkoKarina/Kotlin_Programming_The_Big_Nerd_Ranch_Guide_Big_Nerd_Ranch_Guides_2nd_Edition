package com.bignerdranch.nyethack

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    changeNarratorPersonality()
    player.pontificate()
    narrate("${player.name} of ${player.hometown}, ${player.title}, " +
            "heads down to the town square")
    narrate("${player.name} the ${if (player.isImmortal) "immortal" else "mortal"} " +
            "has ${player.healthPoints} health points")
    visitTavern()
    player.castFireball()
    player.pontificate()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }

    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
        "The hero must have a name."
    }

    return input*/
    println("Madrigal")
    return "Madrigal"
}
