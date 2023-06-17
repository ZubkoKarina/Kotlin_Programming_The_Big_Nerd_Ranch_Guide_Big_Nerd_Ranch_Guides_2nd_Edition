fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    //task 0
    var hasSteed: Boolean = false
    var numOfCoins: Int = 50
    //task 2
    val HERO_NAME: String = "Madrigal"
    var temp_str = ""
    HERO_NAME.forEach { temp ->
        temp_str = temp+temp_str
    }
    println(temp_str)
}
/*
* Kotlin REPL(как jshell) - Read, Evaluate, Print, Loop (прочитать, выполнить, вывести, повторить).
* исходный(.kt)->байт-код jvm->выполнение
* var/val - camelCase
* const val - SNAKE_CASE - константа времени компиляции(string, float, byte, int, long, char, double, short, boolean)
* List - коллекция
* Set -  коллекция уникальных
* Map -  колекция пар "ключ-значение"
* поддержка только ref типы
* */
