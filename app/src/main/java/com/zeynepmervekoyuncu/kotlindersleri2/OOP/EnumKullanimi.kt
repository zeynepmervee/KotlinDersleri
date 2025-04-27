package com.zeynepmervekoyuncu.kotlindersleri2.OOP

fun main() {
    ucretHesapla(KonserveBoyut.ORTA , 55)
}

fun ucretHesapla(boyut: KonserveBoyut , adet : Int) {
    when(boyut){
        KonserveBoyut.KUCUK -> println("Ucret : ${adet * 104} TL")
        KonserveBoyut.ORTA -> println("Ucret : ${adet * 207} TL")
        KonserveBoyut.BUYUK -> println("Ucret : ${adet * 389} TL")
    }

}