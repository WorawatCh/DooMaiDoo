package com.example.user.doomaidoo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_catagories.*

class catagoriesActivity : AppCompatActivity() {
//    lateinit var action : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagories)
        var allButton = ArrayList<RadioButton>()
        var toPrint = ArrayList<String>()
        allButton.add(actionButton)
        allButton.add(adventureButton)
        allButton.add(animationButton)
        allButton.add(comedyButton)
        allButton.add(dramaButton)
        allButton.add(fantasyButton)
        allButton.add(horrorButton)
        allButton.add(scifiButton)
        allButton.add(superheroButton)
        allButton.add(warButton)
        var selected = allButton.filter { it.isChecked }
        for (p in selected) toPrint.add(p.id.toString())
//        val allCatagories = listOf(actionButton,adventureButton,animationButton,comedyButton,dramaButton,fantasyButton,horrorButton,scifiButton,superheroButton,warButton)
//        val checked = allCatagories.filter { it.isChecked }


        nextbutton.setOnClickListener({
            Toast.makeText(this, toPrint.toString() ,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, home::class.java);
            startActivity(intent)
        })
    }
}
