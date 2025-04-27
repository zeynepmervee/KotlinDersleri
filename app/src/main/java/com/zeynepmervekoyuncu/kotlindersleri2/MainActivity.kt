package com.zeynepmervekoyuncu.kotlindersleri2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var str:String? = null
    lateinit var info:String //lateinit : daha sonra bu değişkene deger atacayacagim demek oluyor.
    // lateinit sadece var ile kullanilir, cunku val ile deger atanamaz tekrar.
    // lateinit ile integer, double, boolean deger tanımlanamaz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        info="Bilgi"

    }
}