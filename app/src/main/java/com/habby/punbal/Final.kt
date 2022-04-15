package com.habby.punbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
    }

    fun StOv (view: View) {
        Intent(applicationContext, GPmh::class.java).also { startActivity(it) }
        finish()
    }
}