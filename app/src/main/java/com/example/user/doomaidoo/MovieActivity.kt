package com.example.user.doomaidoo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_movie.*
import kotlinx.android.synthetic.*
import android.content.DialogInterface
import android.provider.MediaStore
import android.support.v7.app.AlertDialog
import android.widget.*
import kotlinx.android.synthetic.main.activity_catagories.*


class MovieActivity : AppCompatActivity() {

    private var tvTitle: TextView? = null
    private var tvCatagories: TextView? = null
    private var img: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        tvTitle = findViewById<View>(R.id.textview_name) as TextView?
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
              when(catagories){
                 "Animation" -> alert()
                  "Drama" -> alert()
                  "Sci-fi" -> alert()
                  "Horror" -> alert()
                  else -> {
                      val intent1 = Intent(this, ReviewActivity::class.java)
                      startActivity(intent1)
                      finish()
                  }
              }
     })
}
     fun alert(){
        val builder = AlertDialog.Builder(this)
        builder.setMessage("You are not allow to review this movie")
        builder.setPositiveButton("Go back", DialogInterface.OnClickListener { dialog, id ->
        })
        builder.show()
    }
}


