package com.example.task1

/*
    4. Hàm & Extension Function
        Hàm thông thường
        Hàm một dòng
        Default Parameter & Named Argument
        Extension Function
 */
fun main() {
    demoUnitFunc()

    var listNumber = listOf(1, 2, 3, 4, 5)
    println("Sum of listNumber: " + demoReturnValueFunc(listNumber))

    var a = 5
    var b = 6
    println("$a + $b = " + demoSumOneLine(a, b))

    println("Demo default parameter: ")
    demoWithDefaultParameter()

    println("Demo named arguement: ")
    demoWithDefaultParameter(name = "Nguyen Van A", age = 20)

    var password: String? = "123"
    var res = password?.validatePass()
    println("$password is validatePass? $res")
}

fun demoUnitFunc() {
    var date = "27/08/2025"
    println("Today is $date")
}

fun demoReturnValueFunc(listNumber: List<Int>) : Int {
    var sum = 0
    for (i in listNumber) {
        sum += i
    }
    return sum
}

fun demoSumOneLine(a: Int, b: Int) = a + b

fun demoWithDefaultParameter(name: String = "Nguyen Thi Quyen", school: String = "Ptit", age: Int = 22) {
    print("My name is $name studying at $school. ")
    print("I'm $age.")
    println()
}


// demo extension function
fun String.validatePass() : Boolean {
    if (this.isEmpty()) {
        return false
    }

    if(this.length > 8) {
        return true
    }

    return false
}
