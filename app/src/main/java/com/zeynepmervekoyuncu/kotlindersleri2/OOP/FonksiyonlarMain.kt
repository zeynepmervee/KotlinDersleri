package com.zeynepmervekoyuncu.kotlindersleri2.OOP

fun main (){
    val f = Fonksiyonlar()

    f.selamla1()
    val gelenSonuc = f.selamla2() //veri transferi
    //println("Gelen sonuç: $gelenSonuc")
    //f.selamla3("Zeynep")

    f.topla(3,4,5)
    f.topla(3.2,2)

}