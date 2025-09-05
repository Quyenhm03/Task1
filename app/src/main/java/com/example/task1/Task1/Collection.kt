package com.example.task1.Task1

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
    demoCollectionFunction()
}

fun demoList() {
    // immutable list
    var list1 = listOf(1, 2, 3, 4)
    println(list1)
    println(list1.reversed())

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

fun demoCollectionFunction() {
    // remove duplicate
    val arr = arrayOf(9, 1, 2, 3, 5, 1, 7, 3, 6)
    println("Array with unique element use distinct: " + arr.distinct())
    println("Array with unique element use set: " + arr.toSet())
    println("Array with unique element use hashSet: " + arr.toHashSet())

    // convert list to string
    val listName = listOf("Nguyen", "Thi", "Quyen")
    val name = listName.joinToString (
        separator = " ",
        postfix = ": Ptit"
    )
    println(name)

    // reduce, fold
    val listNum = listOf(1, 2, 3, 4, 5)
    val sumReduce = listNum.reduce { acc, i ->  acc + i}
    println("Sum of list use reduce: " + sumReduce)

    val sumFold = listNum.fold(-1) {
        acc, i ->  acc + i
    }
    println("Sum of list use fold: " + sumFold)

    // find element
    val listStr = listOf("Milk", "Juice", "Candy", "Water")
    println(listStr.find{ it.contains('e') })

    // union, intersect
    val list1 = listOf(1, 2, 3, 7, 0, 5)
    val list2 = listOf(2, 8, 6, 3, 0, 7)
    println("Union result: " + list1.union(list2))
    println("Intersect result: " + list1.intersect(list2))

    // take and drop
    val list3 = listOf(1, 2, 3, 4, 5)
    println("Take result: " + list3.take(2))
    println("Take last result: " + list3.takeLast(2))
    println("Drop result: " + list3.drop(2))
    println("Drop last result: " + list3.dropLast(2))

    val list4 = list3.takeWhile { it % 2 == 0 }
    println("Take while result: " + list4)

    // sorted
    val list5 = listOf(9, 1, 6, 7 , 4, 6)
    println("List sort asc: " + list5.sorted())
    println("List sort desc: " + list5.sortedDescending())

    // zip, unzip
    val listOne = listOf(1, 2, 3, 4, 5)
    val listTwo = listOf("a", "b", "c", "d", "e", "f")
    val listZip = listOne zip listTwo
    println("Zip result: " + (listOne zip listTwo))

    val (tmp1, tmp2) = listZip.unzip()
    println("Unzip result: " + tmp1 + " " + tmp2)

    // partition
    val list6 = listOf(-1, 6, -9, 5, 0)
    val (negative, positive) = list6.partition { it > 0 }
    println("Partition result: ")
    println(negative)
    println(positive)

    // groupBy
    println("Group by result: " + list6.groupBy { it % 2 == 0 })

    // chunked: split, list
    println("Chunked result: " + list6.chunked(3))

    // copy
    val arrNum = arrayOf("1", "2", "3", "4", "5")
    val arrNumCopy1 = arrNum.copyOfRange(1, 3)
    print("Copy result with range: ")
    arrNumCopy1.forEach { print("$it ") }
    println()

    val arrNumCopy2 = arrNum.copyOf(6)
    print("Copy result with copy new size: ")
    arrNumCopy2.forEach { print("$it ") }
    println()

    // filter
    val list = listOf(0, 1, 3, 8, 4, 8, 6, 8)
    val filteredList = list.filter { it % 2 == 0 }
    println("Filter result: " + filteredList)
    println("Filter index result: " + list.filterIndexed{ value, i -> value == i })

    val mixedList = listOf(1, 2, 3, "one", "two", 4, "three", "four")
    val strList = mixedList.filterIsInstance<String>()
    print("Filter instance result: " + strList)
}