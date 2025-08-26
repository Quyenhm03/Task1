package com.example.task1

/*
    3. Collection (Danh sách dữ liệu)
    List (Danh sách)
    Set (Tập hợp không trùng lặp)
    Map (Dạng key-value)
    Các hàm quan trọng trong Collection
    map(), filter(), reduce(), forEach(), first(), last(), ...
 */
fun main() {
    demoList()
    demoSet()
    demoMap()
}

fun demoList() {
    // immutable list
    var list1 = listOf(1, 2, 3, 4)
    println(list1)

    // mutable list
    var list2 = mutableListOf(1, 2, 3, 4)
    list2.add(5)
    println(list2)

    println("First element of list2: ${list2.first()}")
    println("Last element of list2: ${list2.last()}")

    list2.sortDescending()
    println(list2)

    var list3 = list2.filter { it > 2 }
    println(list3)

    val sum = list2.reduce { acc, i -> acc + i }
    println("Sum of list2: $sum")

}

fun demoSet() {
    val num = setOf(1 ,2, 2, 4, 3, 6, 7, 8, 5)
    println("The number of element: " + num.count())
    println("Max value: " + num.max())
    println("Min value: " + num.min())
    println("Sum in set: " + num.sum())
    println("Average in set: " + num.average())

    println("The set contains 10? ${num.contains(10)}")

    print("Set: ")
    num.forEach { print("$it ") }
    println()
}

fun demoMap() {
    val map = mapOf(1 to "One", 2 to "Two" , 3 to "Three", 4 to "Four")
    println(map)
    println("Map Keys: " + map.keys )
    println("Map Values: " + map.values )

    val filteredMap = map.filter { it.key % 2 == 0 }
    println("Filtered map: $filteredMap")

    val num = 5
    println("Map contain key $num: " + map.containsKey(5))
}