package com.zeynepmervekoyuncu.kotlindersleri2.Collections
// HashMap JSON ile benzemektedir.
// Map, Dictionary

fun main() {
    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller[34] = "İstanbul"
    iller[6] = "Ankara"
    println(iller)
    iller[16] = "Yeni Bursa" // guncelleme

    val il = iller[6] // il Ankara degeri aldi
    iller.size // boyut

    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34) // İstanbulu siler
    iller.clear() // temizler


}