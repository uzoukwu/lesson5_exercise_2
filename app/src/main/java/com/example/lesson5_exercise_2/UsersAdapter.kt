package com.example.lesson5_exercise_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.social_item.view.*

class UsersAdapter(val context: Context, private val users: ArrayList<Users>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.social_item, parent ,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.icon.setImageBitmap(users[position].icon)
        holder.name.text = users[position].name
        //holder.like.text = users[position].like
        //holder.buttonlike.setImageBitmap(users[position].button)

    }

    override fun getItemCount(): Int {
        return users.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val icon = itemView.ivIcon
    val name = itemView.tvName
    //val like = itemView.tvLikeCount
    //val buttonlike = itemView.btLike

}
