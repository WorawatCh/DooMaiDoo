package com.example.user.doomaidoo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

import java.util.ArrayList

/**
 * Created by User on 4/5/2561.
 */

class home : AppCompatActivity() {

    internal lateinit var movieList: MutableList<Movie>
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home1)

        movieList = ArrayList()
        movieList.add(Movie("Rampage", "Action", R.drawable.rampage))
        movieList.add(Movie("TombRaider", "Adventure", R.drawable.tombraider))
        movieList.add(Movie("Coco", "Animation", R.drawable.coco))
        movieList.add(Movie("Daddy Home 2", "Comedy", R.drawable.daddyhome2))
        movieList.add(Movie("Midnight Sun", "Drama", R.drawable.midnightsun))
        movieList.add(Movie("Fantastic Beasts And Where To Find Them", "Fantasy", R.drawable.fantasticbeast))
        movieList.add(Movie("Insidious 4", "Horror", R.drawable.insidious4))
        movieList.add(Movie("The Cloverfield Paradox", "Sci-fi", R.drawable.cloverfield3))
        movieList.add(Movie("Avenger Infinity Wars", "Superhero", R.drawable.infinitywar))

        val myrv = findViewById<View>(R.id.recycleview_id) as RecyclerView
        val myAdapter = RecycleViewAdapter(this, movieList)
        myrv.layoutManager = GridLayoutManager(this, 2)
        myrv.adapter = myAdapter
    }

}
