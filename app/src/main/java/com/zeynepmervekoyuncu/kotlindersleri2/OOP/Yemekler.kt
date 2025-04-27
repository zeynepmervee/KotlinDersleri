package com.zeynepmervekoyuncu.kotlindersleri2.OOP

data class Yemekler (var id:Int, var ad:String, var fiyat:Int){

    init {
        println("**********nesne olustu**************")
    }

    fun bilgiAl(){
        println("Id: ${this.id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }
    //this : bulunduğu sınıfı temsil eder
    //super : kalıtımda bir üst sınıfı temsil eder
}

//data class : vt üzerindeki çalışmaları da bu sınıf üzerinde yürütmek için kullanılır
//constructor (init metodu) : init başlangıç demektir. başlangıçta ad id ve fiyat ataması yapılması budur
//bu sınıfta nesne oluşturulduğunda çalışsın demek için init yani constructor kullanılır
//kotlinde setter getter yok, gelişmiş bir dil
