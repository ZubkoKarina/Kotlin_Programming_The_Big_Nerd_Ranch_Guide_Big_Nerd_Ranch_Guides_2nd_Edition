
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
*
*
*
*
*
*/