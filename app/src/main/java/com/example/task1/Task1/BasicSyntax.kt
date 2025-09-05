package com.example.task1.Task1

/*
    1. Cú pháp cơ bản của Kotlin
    Biến & Hằng số
    Kiểu dữ liệu (Int, Float, Boolean, String, Char, Double, Long)
    Toán tử (+, -, *, /, %, +=, -=, ==, !=, >, <, &&, ||)
    Ép kiểu (toInt(), toString(), toDouble(),...)
    Chuỗi & String Template ("Hello, $name")
 */
fun main() {
    demoVariable()
    demoDataType()
    demoOperator()
    demoConversion()
    demoString()
}

fun demoVariable() {
    // mutable
    var a = 2024
    a = 2025
    println("Mutable variable: $a")

    // immutable
    val b = "Eco Mobile"
    println("Immutable variable: $b")
}

fun demoDataType() {
    var myint = 26
    var myFloat = 0.5f
    var myBoolean = true
    var myString: String = "Kotlin"
    var myChar: Char = 'Q'
    var myDouble: Double = Double.MAX_VALUE
    var mylong: Long = 100L

    println("My integer ${myint}")
    println("My float ${myFloat}")
    println("My boolean ${myBoolean}")
    println("My string ${myString}")
    println("My char ${myChar}")
    println("My double ${myDouble}")
    println("My long integer ${mylong}")
}

fun demoOperator() {
    // +, -, *, /, %
    var a = 26
    var b = 3
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a % b = " + (a.rem(b)))

    // +=, -=, ==, !=, >, <
    a += 3
    println("a += 3 -> a = $a")
    b -= 1
    println("b -= 1 -> b = $b")

    println("a > b : " + (a > b))
    println("a < b : " + (a < b))
    println("a == b : " + (a == b))
    println("a != b : " + (a != b))

    // &&, ||
    var c = 5
    if(a > b && b > c)
        println(a)
    if(a < b || a > c)
        println(b)
}

fun demoConversion() {
    var numFloat = 9.8f
    var numInt = numFloat.toInt()
    var numStr = numFloat.toString()

    println("Float: $numFloat, Int: $numInt, String: $numStr")
}

fun demoString() {
    val name = "Quyen"
    println("Hello $name!")
    println("Name has ${name.length} character")
    println("Uppercase name: " + name.toUpperCase())
    println("Lowercase name: " + name.toLowerCase())

    val str = "Hello! My name is Quyen."
    val str1 = str.substring(5, 10)
    println("Sub string from 5-10: $str1")
    println("Replace name: " + str.replace("Quyen", "abc"))

    val s1 = "Kotlin"
    val s2 = "kotlin"
    println("Compare result: " + s1.compareTo(s2, ignoreCase = false))

    val fullName = "Nguyen Thi Quyen"
    val list = fullName.split(" ")
    println(list)
}