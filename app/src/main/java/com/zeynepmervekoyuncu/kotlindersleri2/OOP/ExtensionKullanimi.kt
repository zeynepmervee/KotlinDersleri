package com.zeynepmervekoyuncu.kotlindersleri2.OOP

fun main(){
    val sonuc = 5 carp 2 //infix eklediğimiz için böyle oldu
    println(sonuc) // infix yazmasaydık 5.carp(2) yazardık
}

infix fun Int.carp(sayi:Int) : Int { //integer sınıfına çarp fonksiyonu ekledik Int.carp yazarak
    return this * sayi //this o anki bağlı class olan Int classını temsil eder
}