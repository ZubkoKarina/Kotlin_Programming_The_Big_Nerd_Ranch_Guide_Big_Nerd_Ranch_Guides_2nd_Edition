
fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
    //после count - литерал функции
    println("KarinaZubko".count({ letter -> letter == 'k' }))
    Narration.narrate("A hero exters the woen of Kronstadt. What is their name?")
    //a simple example of lambda expressions 
    val printHello: () -> Unit = { println("Hello")}
    printHello()
}
/*
* fun - именованные функции
* анонимные функции - лямбда-функции
* Alonzo Church 1930 - лямбда-исчисления
*
*
*
*
*
*
*
*/