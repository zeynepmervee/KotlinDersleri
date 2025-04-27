package com.zeynepmervekoyuncu.kotlindersleri2.OOP
//null, NaN, nil

fun main() {
    var mesaj: String? = null

    //mesaj = "merhaba"
    // yöntem 1
    // mesaj? yazınca sorun yoksa çalışır sorun varsa uygulama çökmez
    println("Yontem 1 : ${mesaj?.toUpperCase()}")


    // yöntem 2
    // sorun yoksa çalışır, varsa çöker
    // println("Yontem 1 : ${mesaj!!.toUpperCase()}") // bu satır hata verir


    // yöntem 3
    // null kontrol
    if (mesaj!=null) {
        println("Yontem 3 : ${mesaj.toUpperCase()}")
    } else {
        println("Degiskende null ifade yer almaktadir")
    }

    //burada if (mesaj!=null) demis gibi oluruz. kisa versiyonu. else kismi yok
    mesaj?.let{
        println("Yontem 3 : ${mesaj.toUpperCase()}")
    }
}