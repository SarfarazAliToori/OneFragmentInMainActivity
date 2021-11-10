package com.example.onefragmentinmainactiviy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onefragmentinmainactiviy.Fragments.MyFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, MyFragment()).commit()
    }
}