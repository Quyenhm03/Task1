package com.example.task1

/*
    6. Lập trình hướng đối tượng (OOP) trong Kotlin
        Class & Object
        Constructor (Primary & Secondary)
        Kế thừa (open class, override)
        Interface & Abstract Class
        Data Class
        Singleton & Companion Object
 */

fun main() {
    // class
    var student = Student()
    student.name = "Nguyen Thi Quyen"
    student.age = 22
    student.major = "Information Technology"
    student.showInfo()

    // data class
    var book = Book("Kotlin Programming", "abc", "2025")
    println(book)

    // Constructor (Primary & Secondary)
    var customer = Customer("abcd@gmail.com")
    customer.showInfoCustomer()

    // abstract class
    var bookRepoImpl = BookRepoImpl()
    bookRepoImpl.selectBookById()

    // interface
    var customerRepoImpl = CustomerRepoImpl()
    customerRepoImpl.selectCustomerById("1")

    // Inheritance
    var dog = Dog()
    dog.talk()

    var cat = Cat("Cat")
    cat.talk()

    // singleton(object) & companion Object (static)
    println(SingletonKotlin.name)
    println(SingletonKotlin.doSonething())

    var pi = MyClass.PI
    println(pi)
    MyClass.showInfo()
}

class Student {
    var name: String = ""
    var age: Int = 0
    var major: String = ""

    fun showInfo() {
        println("$name - $age - $major")
    }
}

data class Book(val title: String, val author: String, val date: String)

class Customer (var name: String = "", var phone: String = "") {
    private var email: String = ""

    init {
        name = "abcd"
        phone = "0123456789"
    }

    constructor(email: String) : this() {
        this.email = email
    }

    fun showInfoCustomer() {
        println("Customer: $name, phone: $phone, email: $email")
    }
}

abstract class BookRepo {
    abstract fun selectBookById()
    fun saveBook() {}
}

class BookRepoImpl : BookRepo() {
    override fun selectBookById() {
        println("bookSelected = Kotlin Programming")
    }
}

interface ICustomerRepo {
    fun selectCustomerById(userId: String) {
        println("Call from interface")
    }
}

class CustomerRepoImpl : ICustomerRepo {
    override fun selectCustomerById(userId: String) {
        super.selectCustomerById(userId)
        println("Call inside class")
    }
}

open class Animal(var name: String = "") {
    open fun talk() {}
}

class Dog : Animal() {
    init{
        this.name = "Dog"
    }

    override fun talk() {
        println("Gau gau")
    }
}

class Cat : Animal {
    constructor(name: String) : super(name)

    init{
        this.name = "Cat"
    }

    override fun talk() {
        println("Meo meo")
    }
}

// singleton
object SingletonKotlin {
    var name = "Kotlin"
    fun doSonething() {}
}

// companion object
class MyClass {
    companion object {
        val PI = 3.14f
        fun showInfo() {
            println("Example for companion object")
        }
    }
}



