package com.example.user.doomaidoo

import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by User on 3/5/2561.
 */

class RecycleViewAdapter(private val mcontext: Context, private val mData: List<Movie>) : RecyclerView.Adapter<RecycleViewAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view: View
        val mInflater = LayoutInflater.from(mcontext)
        view = mInflater.inflate(R.layout.homepage, parent, false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.movieTitle.text = mData[position].name
        holder.movieImage.setImageResource(mData[position].thumbnail!!)
        holder.cardView.setOnClickListener {
            val intent = Intent(mcontext, MovieActivity::class.java)
            intent.putExtra("Movie Title", mData[position].name)
            intent.putExtra("Categories", mData[position].catagories)
            intent.putExtra("Thumbnail", mData[position].thumbnail)
            mcontext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var movieTitle: TextView
        internal var movieImage: ImageView
        internal var cardView: CardView

        init {
            movieTitle = itemView.findViewById<View>(R.id.movie_name) as TextView
            movieImage = itemView.findViewById<View>(R.id.imageView2) as ImageView
            cardView = itemView.findViewById<View>(R.id.cardview_id) as CardView
        }
    }
}
