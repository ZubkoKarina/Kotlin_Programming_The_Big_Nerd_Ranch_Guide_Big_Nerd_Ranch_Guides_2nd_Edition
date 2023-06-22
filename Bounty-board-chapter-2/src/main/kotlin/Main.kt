import java.util.concurrent.BrokenBarrierException
import kotlin.math.round

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
    val quest: String = when (val playerLevel_0 = playerLevel++) {
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
    // when без аргументов
    val temp_0: String = when {
        1>2 -> {
            "Good"
        }
        else -> {
            "Invalid"
        }
    }
    
    obtainQuest(1)
    square(56)
    forgeItem("sward", "iron", false, 5)
    println (forgeItem(
        quantity = 5,
        itemName = "sward",
        material = "gold",
        encrustWithJewels = false
    ))

    println("Rounded number: " + (mathRoundedNum(3.75)))
    println("Rounded number: ${mathRoundedNum(3.75)}")
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
    //regular expression
    val pattern = "\\d+".toRegex()
    println("${"12345678".matches(pattern)}")
    //regular expression 0
    println("${"34g535.".matches("""\d+""".toRegex())}")

    // let
    val str: String? = "Hello"
    str?.let{println(it)}
    //?:
    val nullableValue: Int = 35
    val defultValue: Int = 45
    println(nullableValue ?: defultValue)

    readLine()
}
private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = false
): String?{
    if(playerLevel <= 0){
        throw IllegalArgumentException("The player`s level must be at least 1.")
    }
    return when (playerLevel){
        1 -> "Quest for level 1"
        2 -> "Quest for level 2 - madrigal"
        in 3..67 -> "Invalid quest"
        else -> null
    }
}
private fun square(number: Int): Int = number * number
private fun forgeItem(
    itemName: String,
    material: String,
    encrustWithJewels: Boolean = false,
    quantity: Int = 1
): String = "end"

private fun mathRoundedNum(number: Double)
: Long{
    println("Original number: $number")
    return round(number).toLong()
}

private fun readLine(){
    val message: String = try {
        //10/0
        """|$HERO_NAME approaches the bounty board.
        |It reads:
        |"${obtainQuest(playerLevel = 2)?.let { it.replace("[Mm]adrigal".toRegex(), "xxxxxxxxxx") }}"
    """.trimMargin()
    } catch (e:Exception){
        "$HERO_NAME, can`t read what`s on the bounty board.${e.message}"
    }
    println(message)
}

/*
* control flow - поток выполнния
* && - и
* || - или
* .. - интервал
* Conditional Expression - условные выражения
* выражение when всегда должно быть исчерпывающим (exhaustive)
* c when только in is ==
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
* Именованние аргументов функции позволяет передават параменты в любо порядке
* параметры всегда val
* when - замена множесва(типо switch)
* параметр - то что требуется функции
* аргумент - то что передается при вызове
* без return - unit
* тип Nothing - сообщает компилятору что функция гарантированно не будет выполнена успешно
* использование в TODO(), то что еще предстоит реализовать
* `is`() - можно использовать зарезервированные слова
* или же `users should`() с пробелами
* Byte 8
* Short 16
* Int 32
* Long 64
* Float 32
* Double 64
* Числа с плавающей точкой - аппроксимация
* BigDecimal или round()
* "%.2f" - форматная строка
* "" + "" - конкатонация строк
* "$name abc" - интерполяция строк
* ${ваше выражение}
* Выражение(expression) - фрагмент кода, который вычесляет значение и возращает результат
* Инструкция(statement) - фрагмент кода, который выполняет определенное действие
* """ """ - необработанная строка(raw string)
* readLine() - чтение с консоли
* regular expression
* toRegex() - создание регулярных выражений
* matches() - проверка соответствия строки регуляторному выражению
* все строки - неизменяемы
* == - структурное равенство -> equals() в Java
* === - оператор ссылочного равенсва
* nullable и non-nullable
* ошибки времени компиляции - во время компиляции
* ошибки аремени выполнения - после компиляции
* 1. использовать non-nullable если это возможно
* 2. if(<> != null)
* 3. ?. - safe call operator(безопасный вызов)
* let - принимает обьект как параметр и предоставляет доступ к нему внутри лямба-выражения
* ?: оператор обьединения с null(Elvis) - "если слева от меня стоит null, то выполняй операцию справа меня"
* !! - оператор утверждения не-null-значения(non-null assertion operator)(оператор двойного восклицания)
* readLine()!!.replace(...).toInt() означает: «Меня не интересует, вернет readLine значение null или нет, все равно преобразуй его в число!»
* Использование if-else, ?:, ?., !!, let:
*   if-else: для простой условной логики, между двумя вариантами действий
*   ?:(Elvis): для обработки значений и предоставление значенний по умолчанию
*   ?.: для вызова если обьект не равен null
*   let: для выполнения дополнительных операций внутри лямба-выражений
* throw - выдача исключенний
* Исключения прерывают нормальное выполнение программы. Они предоставляют ошибочное состояние, которое надо исправить.
* try и catch - указывает как должны обрабатываться исключения
*    try{
*      //код который может вызвать исключение
*    } catch(e: Exception){
*      //обработка исключения
*    }
*
*
* */