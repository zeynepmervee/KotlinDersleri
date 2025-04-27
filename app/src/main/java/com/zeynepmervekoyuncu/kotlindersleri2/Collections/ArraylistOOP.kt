package com.zeynepmervekoyuncu.kotlindersleri2.Collections

fun main(){
    val f1=Filmler(1,"Babam ve Oğlum",50)
    val f2=Filmler(2,"Neşeli Hayatlar",30)
    val f3=Filmler(3,"Kış Uykusu",80)

    val filmlerListesi = ArrayList<Filmler>() // filmler türünden bir arraylist
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }


    // sıralama - sorting

    println("------------- Fiyata göre artan -------------")
    val siralama3=filmlerListesi.sortedWith(compareBy{ it.fiyat })
    for (film in siralama3){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }
    println("------------- Ada göre artan -------------")
    val siralama1=filmlerListesi.sortedWith(compareBy{ it.ad })
    for (film in siralama1){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }
    println("------------- Fiyata göre azalan -------------")
    val siralama2=filmlerListesi.sortedWith(compareByDescending{ it.fiyat })
    for (film in siralama2){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }


    // filtreleme

    println("------------- Filtreleme 1 ---------------")
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 && it.fiyat < 60 } // 40 tlden büyük olanlar
    for (film in filtreleme1){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }

    println("------------- Filtreleme 2 ---------------")
    val filtreleme2 = filmlerListesi.filter { it.ad.contains("at") } // içinde at geçen adlara sahip veriler
    for (film in filtreleme2){
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }
}