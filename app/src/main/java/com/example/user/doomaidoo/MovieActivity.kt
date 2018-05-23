package com.example.user.doomaidoo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity() {

    private var tvTitle: TextView? = null
    private var tvCatagories: TextView? = null
    private var img: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        tvTitle = findViewById<View>(R.id.textview_id) as TextView?
        tvCatagories = findViewById<View>(R.id.txt_cat) as TextView?
        img = findViewById<View>(R.id.movieTHumbnail) as ImageView?

        val intent = intent
        val title = intent.extras!!.getString("Movie Title")
        val catagories = intent.extras!!.getString("Categories")
        val image = intent.extras!!.getInt("Thumbnail")

        tvTitle!!.text = title
        tvCatagories!!.text = catagories
        img!!.setImageResource(image)

         reviewbutton.setOnClickListener({
             val intent = Intent(this, ReviewActivity::class.java);
             startActivity(intent)
         })
    }
}
