package com.zeynepmervekoyuncu.kotlindersleri2.OOP

class Kedi : Memeli() {

    //alt sınıf en üst sınıfa erişebiliyor! memeliden kalıtım alıyor ama hayvandan geldi bu metot
    override fun sesCikar() { //ses yazinca kendi geldi
        //super.sesCikar() // super : üst sınıf
        println("Meow Meow")
    }
}