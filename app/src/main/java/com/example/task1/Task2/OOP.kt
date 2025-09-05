package com.example.task1.Task2

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
    customerRepoImpl.selectCustomerById1("1")

    // Inheritance
    var dog = Dog()
    dog.talk()

    var cat = Cat("Cat")
    cat.talk()

    // singleton(object) & companion Object (static)
    // 1. singleton with object
    println(SingletonKotlin.name)
    println(SingletonKotlin.doSonething())

    //2. singleton with companion object
    demoSingletonWithCompanionObject()

    //3. singleton with lazy
    demoSingletonWithLazy()

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

interface ICustomerRepo1 {
    fun selectCustomerById1(userId: String) {
        println("Call from interface")
    }
}

interface ICustomerRepo2 {
    fun selectCustomerById2(userId: String) {
    }
}

class CustomerRepoImpl : ICustomerRepo1, ICustomerRepo2 {
    override fun selectCustomerById1(userId: String) {
        super.selectCustomerById1(userId)
        println("Call inside class")
    }

    override fun selectCustomerById2(userId: String) {
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

// companion object
class MyClass {
    companion object {
        val PI = 3.14f
        fun showInfo() {
            println("Example for companion object")
        }
    }
}

// singleton
object SingletonKotlin {
    var name = "Kotlin"
    fun doSonething() = "Doing something"
}

fun demoSingletonWithCompanionObject() {
    println("Demo singleton with companion object: ")
    val singleton1 = SingletonCompanion.getInstance()
    println("Initial info: ${singleton1.getInfo()}")

    val singleton2 = SingletonCompanion.getInstance()
    singleton2.setInfo("New class info") // Update info

    println("Updated info from singleton1: ${singleton1.getInfo()}")
    println("Updated info from singleton2: ${singleton2.getInfo()}")
}

fun demoSingletonWithLazy() {
    println("Demo singleton with companion lazy: ")

    val singleton1 = SingletonLazy.instance
    println("Initial info: ${singleton1.getInfo()}")

    val singleton2 = SingletonLazy.instance
    singleton2.setInfo("New class info") // Update info

    println("Updated info from singleton1: ${singleton1.getInfo()}")
    println("Updated info from singleton2: ${singleton2.getInfo()}")
}


class SingletonCompanion private constructor() {
    private var info: String = "Singleton Companion"

    fun getInfo(): String = info
    fun setInfo(newInfo: String) {
        info = newInfo
    }

    companion object {
        @Volatile
        private var instance: SingletonCompanion? = null

        fun getInstance(): SingletonCompanion = instance ?: synchronized(this) {
            instance ?: SingletonCompanion().also { instance = it }
        }
    }
}

class SingletonLazy private constructor() {

    private var info: String = "Singleton Companion"

    fun getInfo(): String = info
    fun setInfo(newInfo: String) {
        info = newInfo
    }

    companion object {
        val instance: SingletonLazy by lazy {
            SingletonLazy()
        }
    }

}


