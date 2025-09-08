package com.example.task1.task1

fun main() {
    demoLetOperation()
    demoRunOperation()
    demoWithOperation()
    demoAlsoOperation()
    demoApplyOperation()
}

class Person() {
    var name: String = "abc"
    var phone: String = "0123456789"

    fun displayInfo() = println("Name: $name, phone: $phone")
}

fun demoLetOperation() {
    var person = Person()
    val name = person.name?.let {
        "My name is: $it"
    }
    println(name)
}

fun demoRunOperation() {
    var person = Person()
    var info = person?.run {
        name = "Quyen"
        phone = "1234567890"
        "Name: $name, phone: $phone."
    }
    println(info)
}

fun demoWithOperation() {
    val person = with(Person()) {
        "The name of the Person is: ${this.name}"
    }
    println(person)
}

fun demoApplyOperation() {
    val person: Person? = null
    person?.apply {
        name = "Ptit"
        phone = "2345678901"
        displayInfo()
    }
}

fun demoAlsoOperation() {
    val name = Person().also {
        print("Current name is: ${it.name}\n")
        it.name = "temp"
    }.run {
        "Modified name is: $name\n"
    }
    print(name)
}