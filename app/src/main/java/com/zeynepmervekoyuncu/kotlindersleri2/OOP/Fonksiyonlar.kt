package com.zeynepmervekoyuncu.kotlindersleri2.OOP

// public-private vs yazmazsak default olarak public olur kotlin dilinde.

class Fonksiyonlar {
    //void - sadece işlem yapan (unit)
    fun selamla1(){
        val sonuc = "Merhaba Feyyaz"
        println(sonuc)
    }

    //return - hem islem hem veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhaba Feyyaz"
        return sonuc
    }

    fun selamla3(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }


    //overloading
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam : ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Int,sayi3:Int){
        println("Toplam : ${sayi1+sayi2+sayi3}")
    }
    fun topla(sayi1:Double,sayi2:Int){
        println("Toplam : ${sayi1+sayi2}")
    }

}

//overloading: bir sınıfın içinde aynı isimde fonksiyonları kullanmak