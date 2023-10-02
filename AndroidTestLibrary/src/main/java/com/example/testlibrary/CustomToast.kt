package com.example.testlibrary

import android.content.Context
import android.widget.Toast

class CustomToast {
    companion object {
        fun showToast(context : Context, message : String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}