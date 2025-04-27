package com.zeynepmervekoyuncu.kotlindersleri2.Collections

fun main(){
    // 1. Compile error : Kodlama yaparken
    // val sayi = 100
    // sayi=500

    // 2. Runtime error
    val x = 10
    val y = 0

    try {
        println("Sonuc : ${x/y}")
        println("Islem tamamlandi")

    }catch(e:Exception){
        println("Hata! Ikinci Sayi 0 Olamaz.")
        println(e.message)
        println(e.localizedMessage)
    }
}