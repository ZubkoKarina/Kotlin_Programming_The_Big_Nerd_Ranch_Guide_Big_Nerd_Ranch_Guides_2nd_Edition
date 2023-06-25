
fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
    //после count - литерал функции
    println("KarinaZubko".count({ letter -> letter == 'k' }))
    Narration.narrate("A hero exters the woen of Kronstadt. What is their name?")
    //a simple example of lambda expressions
    val printHello: () -> Unit = {println("Hello")}
    printHello()
    val sum:(Int, Int) -> Int = { a, b ->
        a+b
    }
    println("${sum(3,4675)}")
}
/*
* fun - именованные функции
* анонимные функции - лямбда-функции
* Alonzo Church 1930 - лямбда-исчисления
* val lambdaName: (param1: Type1, param2: Type2, ...) -> ReturnType = { arg1, arg2, ... ->
*   //тело функции
*   //..
*   //возращяемое значение
* }
*
*
*
*
*
*
*/