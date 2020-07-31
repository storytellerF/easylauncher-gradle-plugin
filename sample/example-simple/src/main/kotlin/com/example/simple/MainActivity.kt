package com.example.simple

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<View>(R.id.button).setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hello, Android!")
                .setMessage("This is an example app.")
                .setPositiveButton(android.R.string.ok, null)
                .show()
        }
    }
}