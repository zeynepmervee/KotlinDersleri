package com.zeynepmervekoyuncu.kotlindersleri2.Collections

fun main(){
    // tanimlama
    val meyveler = ArrayList<String>()

    // veri ekleme
    meyveler.add("Elma")   // 0.
    meyveler.add("Muz")    // 1.
    meyveler.add("Kiraz")  // 2.
    //println(meyveler)

    // guncelleme
    meyveler[1] = "Yeni Muz"
    //println(meyveler)

    // insert : istediğimiz bir indexe ekleriz. diğer elemanlar kayar
    meyveler.add(1,"Portakal")
    //println(meyveler)

    // okuma
    //println(meyveler.get(3))  // kiraz yazdırır 3. index
    //println(meyveler[3])

    //println("Boyut : ${meyveler.size}")
    meyveler.reverse() // indexleri sondan başa doğru ters çevirir

    for(meyve in meyveler){
        //println("Dongudeki meyve: $meyve")
    }

    for((indeksss,meyve) in meyveler.withIndex()){ // swift: enumarated
        println("$indeksss. -> $meyve")
    }

    meyveler.removeAt(1)
    meyveler.clear()
    println(meyveler)

}