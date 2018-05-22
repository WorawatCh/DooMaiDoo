package com.example.user.doomaidoo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_catagories.*

class catagoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagories)

        nextbutton.setOnClickListener({
            val intent = Intent(this, home::class.java);
            startActivity(intent)
        })
    }
}
