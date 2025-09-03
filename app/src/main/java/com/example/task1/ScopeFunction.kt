package com.example.task1

// let, run, with, also, apply
// thuc thi 1 khoi code ben trong context cua 1 object (it / this)

// this: run, with
// it: let, also

// return context object: apply, also
// return lambda result: let, run , with

fun main() {
    val person: Person? = Person("David", 35)

    // let xu ly nullable
    val nameLength = person?.let {
        println(it.name.length)
    }

    // run: tinh toan tra ve ket qua
    val info = person?.run {
        "$name is $age years old."
    }
    println(info)

    // with: goi nhieu phuong thuc/ thuoc tinh tren 1 doi tuong
    with(person!!) {
        println("Ten: $name, Tuoi: $age")
    }

    // apply: cau hinh doi tuong
    val newPerSon = Person().apply {
        name = "Eve"
        age = 22
    }
    with(newPerSon!!) {
        println("Ten: $name, Tuoi: $age")
    }

    // also: them tac vu phu
    val list = mutableListOf(1, 2, 3).also {
        println(it)
    }
}

data class Person(var name: String = "", var age: Int = 0)
