package com.zeynepmervekoyuncu.kotlindersleri2.OOP

class ClassB : MyInterface {
    override var degisken: Int = 100

    override fun metod1() {
        println("metot 1")
    }

    override fun metod2(): String {
        return "metot 2"
    }

}