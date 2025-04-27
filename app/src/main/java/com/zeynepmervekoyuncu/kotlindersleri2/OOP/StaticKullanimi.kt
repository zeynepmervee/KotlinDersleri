package com.zeynepmervekoyuncu.kotlindersleri2.OOP

fun main(){
    val a = ClassA()

    //println(a.x)
    //a.metot()

    //println(ClassA().x)

    // statik kullanım. bunun için companion object {  ...  } üç nokta kısmına statik olması istenen metot ve değişkenler yazılır
    println(ClassA.x) // ClassA da parantez yok dikkat! Sını ismiyle direkt erişim statiktir.


}