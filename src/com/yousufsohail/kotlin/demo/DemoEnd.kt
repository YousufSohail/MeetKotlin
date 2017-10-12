package com.yousufsohail.kotlin.demo


//Todo: Defining functions

fun sum(a: Int , b: Int) = a + b

fun printSum(a: Int , b: Int) {
    print(a+b)
}

//fun main(args: Array<String>) {
//    printSum(5, 7)
//}


//Todo: Defining local variables


//fun main(args: Array<String>) {
//    var a = 2
//    a = 5
//
//
//    val cantChangeMe = 4
//    cantChangeMe = 2
//
//}


//Todo: Using string templates

//fun main(args: Array<String>) {
//    var a = 1
//    // simple name in template:
//    val s1 = "a is $a"
//
//    a = 2
//    // arbitrary expression in template:
//    val s2 = "${s1.replace("is", "was")} but now it is $a"
//
//    println(s2)
//
//}



//Todo: Using conditional expressions

fun maxOf(a: Int, b: Int): Int = if (a > b) a else b

//
//fun main(args: Array<String>) {
//    println("max of 0 and 42 is ${maxOf(0, 42)}")
//}


//Todo: Using nullable values and checking for null

//fun main(args: Array<String>) {
//
//    val book: Int = null
//    var myBook: Book = null
//}
//


fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}


//fun main(args: Array<String>) {
//
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
//
//    var buildingA: String = "abc"
//
////    buildingA = null
//
//    var buildingB: String? = "abc"
//
//    buildingB = null
//
//
//
//    val l = if (buildingB != null) buildingB.length else -1
//
//    val l = buildingB?.floor?.office?.address ?: 0
//    val l = buildingB?.length ?: -1
//
//    val l = buildingB!!.length
//}




//Todo: data class

data class Money(val amount: Int, val currency: String)

fun main(args: Array<String>) {

    var internSalary: Int? = null

    val salary: Money = Money(100, "Rs")

    val amount = salary.amount


    val bonus = salary.copy(amount = 50)

    if (salary.equals(bonus)) {

    }

    val listOf = listOf<Money>(salary, bonus)

}



//Todo: Using type checks and automatic casts

//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        // `obj` is automatically cast to `String` in this branch
//        return obj.length
//    }
//
//    // `obj` is still of type `Any` outside of the type-checked branch
//    return null
//}
//
//
//fun main(args: Array<String>) {
//    fun printLength(obj: Any) {
//        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
//    }
//    printLength("Incomprehensibilities")
//    printLength(1000)
//    printLength(listOf(Any()))
//}

//Todo: Using a for loop
//Todo: Using a while loop
//Todo: Using when expression
//Todo: Using ranges
//Todo: Using collections