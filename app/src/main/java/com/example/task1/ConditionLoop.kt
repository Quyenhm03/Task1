package com.example.task1

/*
    2. Cấu trúc điều kiện và vòng lặp
    If - Else
    When (Thay thế switch-case trong Java)
    For Loop (for (i in 1..10) { }) (có bao nhiêu loại for)
    While & Do-While Loop
    ...
 */
fun main() {
    demoCondition()
    demoWhen(3)
    demoLoop()
    demoWhile()
}

fun demoCondition() {
    var a = 100
    var b = 200
    if(a > b){
        print("Number $a is larger than $b")
    }
    else{
        println("Number $b is larger than $a")
    }
}

fun demoWhen(month: Int) {
    when(month) {
        in 1..3 -> print("Spring")
        in 4..6 -> print("Summer")
        in 7..9 -> print("Autumn")
        in 10..12 -> print("Winter")
    }
}

fun demoLoop() {
    print("Even number: ")
    for (i in 0..9 step 2) {
        print("$i ")
    }
    println()

    var str = "Hello"
    for(i in str)
        print("$i ")
    println()
}

fun demoWhile() {
    // while
    var count = 1

    println("Demo while: ")
    while(count <= 10) {
        print("$count ")
        count++
    }
    count--
    println()

    // do - while
    println("Demo do-while: ")
    do {
        print("$count ")
        count--
    }while(count >= 0)
}