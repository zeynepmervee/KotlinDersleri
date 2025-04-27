package com.zeynepmervekoyuncu.kotlindersleri2.Collections

fun main(){
    // HASHSET
    // tanımlama
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)    // meyveler karışık olarak siralanıp yazilir
    meyveler.add("Elma") // yeni elma eklenmez zaten vardı
    meyveler.add("Amasya Elma")

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

}