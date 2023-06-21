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
    //Conditional Expression
    val quest0:String = if(true){
        "Hello quest"
    } else {
        "By quest"
    }
    //Conditional Expression 0
    val temp: Int = 3;
    val quest1:String = when(temp){
        in 1..6 -> "New"
        in 7..9 -> "Old"
        else -> "Invalid val"
    }
    val quest: String = when (playerLevel++) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            val canTalkToBarbarians = false
            if (canTalkToBarbarians) {
                "Embark on a quest to negotiate with the Barbarians."
            } else {
                "Locate the enchanted sword."
            }
        }
        else -> "Explore new territories."
    }
    //task 1
    val numbers = (1..500).toList()
    println(numbers)
    val numbers0 = (10 downTo 1).toList()
    println(numbers0)
    val numbers1 = (1 until 5).toList()
    println(numbers1)

    val omSymbol = '\u0950'
    print(omSymbol)

    val name: String? = "Karina"
    name?.let{
        val message = "Hello, $it"
        println(message)
    }
}
/*
* control flow - поток выполнния
* && - и
* || - или
* .. - интервал
* Conditional Expression - условные выражения
* выражение when всегда должно быть исчерпывающим (exhaustive)
* in - проверка наличия значений в интервале
* аргумент while только ==, in, is или без аргументв
* is - проверка типа обьекта
* toList - преображает в список [1, 2, 3, 4, 5]
* downTo - оператор преобразования убывающего диапазона чисел [5, 4, 3, 2, 1]
* until - оператор для создания полуоткрытого диапазона чисел [1, 2, 3, 4]
* (включая начальное значение но исключая конечное)
* Анатомия функции:
* private fun myFun(имя: тип): String {
*   return ""
* }
* параметры всегда val
* when - замена множесва(типо switch)
* параметр - то что требуется функции
* аргумент - то что передается при вызове
* без return - unit
* тип Nothing - сообщает компелятору что функция гарантированно не будет выполнена успешно
* использование в TODO(), то что еще предстоит реализовать
* `is`() - можно использовать зарезервированные слова
* или же `users should`() с пробелами
* "" + "" - конкатонация строк
* "$name abc" -
* """ """ - необработанная строка
* readLine() - чтение с консоли
* regular expression
* nullable и non-nullable
*
* */