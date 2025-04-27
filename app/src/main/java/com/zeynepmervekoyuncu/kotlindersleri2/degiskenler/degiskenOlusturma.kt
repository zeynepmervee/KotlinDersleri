package com.zeynepmervekoyuncu.kotlindersleri2.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    //println("Id:  $id")

    // Sabitler - Constant performansa faydası var. nedeni şudur:
    // var esnek bir yapı sunar ve daha fazla güc harcanir.
    // val ise daha az guc harcar, yalnizca sonradan degistirilmeyecekse kullanilir.
    var sayi = 30
    sayi = 100

    val numara = 50 // bu sabittir
    //println(numara)

    // TUR DONUSUMLERİ
    // 1 - sayısaldan sayısala dönüşüm (riskli)
    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt() // cikti: 89
    val sonuc2 = i.toInt() // tehlikeli olan durum bu
    //println(sonuc2)
    // 2 - sayısaldan metine dönüşüm
    var x = 85
    val sonuc3 = x.toString() // "85" oldu metin yani

    // 3 - metinden sayisala dönüşüm
    val yazi = "48" // bu string
    val sonuc4 = yazi.toInt()
    //print(sonuc4)

    val yazi2= "48tt"
    val sonuc42 = yazi.toIntOrNull()
    //print(sonuc42)

    if (sonuc4 != null){
        println(sonuc4)
    } else {
        println("sonuc nulldır")
    }
}