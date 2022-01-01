package com.priyanshnama.gossip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loggedIn = false
        if(loggedIn) startActivity(Intent(this,HomeActivity::class.java))
        else startActivity(Intent(this,LoginActivity::class.java))
        finish()
    }
}