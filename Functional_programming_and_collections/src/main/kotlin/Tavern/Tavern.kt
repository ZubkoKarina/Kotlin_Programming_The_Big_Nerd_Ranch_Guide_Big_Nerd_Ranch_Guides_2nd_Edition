package Tavern
public const val HERO_NAME = "KarinaZ"

private const val TAVERN_MASTER = "Taernyl"
private const val TAVERN_NAME = "$TAVERN_MASTER`s Folly"

fun visitTavern() {
    Narration.narrate("$HERO_NAME enters $TAVERN_NAME")
    val patrons = listOf("Eli", "Karina", "Anna")
    println(patrons[0])
    println(patrons.get(1))
    println("${patrons.getOrElse(patrons.lastIndex+1){"none"}}")
}