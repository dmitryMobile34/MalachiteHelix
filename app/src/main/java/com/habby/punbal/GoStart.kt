package com.habby.punbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GoStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_start)
    }

    fun startit (view: View) {
        Intent(applicationContext, GPmh::class.java).also { startActivity(it) }
        finish()
    }
}