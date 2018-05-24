package com.example.user.doomaidoo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.user.doomaidoo.R.id.action
import com.example.user.doomaidoo.R.id.start
import kotlinx.android.synthetic.main.activity_catagories.*

class catagoriesActivity : AppCompatActivity() {
//    lateinit var action : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagories)
        var allButton = ArrayList<RadioButton>()
        var toPrint = ArrayList<String>()
        allButton.add(action)
        allButton.add(adventure)
        allButton.add(animation)
        allButton.add(comedy)
        allButton.add(drama)
        allButton.add(fantasy)
        allButton.add(horror)
        allButton.add(scifi)
        allButton.add(superhero)
        allButton.add(war)
        for(p in allButton){
            if(p.isChecked){
                toPrint.add(p.toString())
            }
        }

        nextbutton.setOnClickListener({
            val intent = Intent(this, home::class.java)
            intent.putExtra("List",toPrint)
            startActivity(intent)
        })
    }
}
