package com.example.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlibrary.CustomToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CustomToast.showToast(this, "This is a simple Toast message!")
    }
}