package com.zeynepmervekoyuncu.kotlindersleri2.OOP

fun main(){
    //nesne oluşturma
    val y1 = Yemekler(100,"Kofte",249)
    //deger okuma
    //println("Id: ${y1.id}")//y1.ad gibi . varsa arada {} gerekiyor
    //println("Ad: ${y1.ad}")
    //println("Fiyat: ${y1.fiyat}")
    y1.bilgiAl() //üstte yazanları bu fonksiyon ile yaptık
    val y2 = Yemekler(200,"Baklava",300)
    y2.ad="Baklava2"
    println("Ad: ${y2.ad}")

    //bunların val olması y1=y2 diye nesne atayamayız
    //ama kendi içindeki id veya ad gibi şeylerini değiştirebiliriz val olsa bile

}