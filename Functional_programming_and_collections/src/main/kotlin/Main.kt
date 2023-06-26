const val HERO_NAME = "KarinaZ"
fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
    //после count - литерал функции
    println("KarinaZubko".count({ letter: Char -> letter == 'k' }))
    println("KarinaZubko0000".count({ it == '0' }))
    println("ZubkoKarina123".count({letter -> letter.isDigit()}))
    Narration.narrate("A hero exters the woen of Kronstadt. What is their name?")
    //a simple example of lambda expressions
    val printHello: () -> Unit = {println("Hello")}
    printHello()
    val sum:(Int, Int) -> Int = { a, b ->
        a+b
    }
    println("${sum(3,4675)}")
    Narration.calculate{x, y -> x+y}
    //anon fun
    val sumA = fun(a:Int, b:Int):Int{
        return a+b
    }
    println("${Narration.loudNarration("Karina`s string", "excited")}")
    Narration.changeNarratorMood()
    Narration.narrate("$HERO_NAME heads to the town square") { message ->
        "\u001b[33;1m$message\u001b[0m"
    }
    require(HERO_NAME != null && HERO_NAME.isNotEmpty()){
        "The hero must have a name"
    }
    Narration.narrate("$HERO_NAME, ${Narration.createTitle(HERO_NAME)}, heads to the town square")
}
/*
* fun - именованные функции
* анонимные функции - лямбда-функции
* Alonzo Church 1930 - лямбда-исчисления
* Синтаксис лямбда-функции:
*    val lambdaName: (param1: Type1, param2: Type2, ...) -> ReturnType = { arg1, arg2, ... ->
*      //тело функции
*      //..
*      //возращяемое значение
*    }
* Синтаксис антонимной функции:
*   fun(argument1: Type1, argument2: Type2, ...): ReturnType {
*       // тело функции
*       // ...
*       // возвращаемое значение
*   }
* it - конструкция обращения к единственному параментру в лямбда-выражении(только если один парамент!)
* Лямбда-выражения не могут иметь аргументы по умолчанию
* Тип функций - единсвенное что хранит для лямбда-функций
* Если при обьявлении, в качестве значения - лямбда-выражения - явное определение типа не требуется
* например не:
*    val narrationModifier:() -> String = {}
* а:
*    val narrationModifier = {}
* Если функция получает тип функции в последнем параментре, крглые скобки можно опустить
* не:
*   "text".count({ it == 't'})
* а:
*   "text".count{ it == 't'}
* Лямбда-функции повышают расход памяти - оптимизация - встраивание(inlining) - inline
* Теперь вместо вызова функции с экземпляром обьекта лямбда-функции компилятор скопирует и вставит тело функции в точку вызова
* inline-fun - вствляет тело функции в любой вызов вместо создания отдельного вызова
* Если слово inline не указано компилятор может сам решить инлайнировать функцию
* Случани когда функию нельзя инлайнировать:
*   -рекурсивная функция
*   -функция спользует другие функции или переменные с более ограниченной областью видимости
*
*/