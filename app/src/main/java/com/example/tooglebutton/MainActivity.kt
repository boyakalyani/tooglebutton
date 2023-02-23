package com.example.tooglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var txt: TextView
    lateinit var btn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.txt_id)
        btn = findViewById(R.id.tgl_id)
        btn.setOnCheckedChangeListener { _, b ->
            if (b) {
                txt.visibility = View.VISIBLE
            } else {
                txt.visibility = View.INVISIBLE
            }
        }
    }
}