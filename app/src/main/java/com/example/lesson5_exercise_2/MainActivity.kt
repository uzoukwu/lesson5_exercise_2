package com.example.lesson5_exercise_2

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSocialPage.adapter = UsersAdapter(this, getUsers())
        rvSocialPage.layoutManager = LinearLayoutManager(this)

        val likebutton = findViewById<View>(R.id.btLike)
        val likecounter = findViewById<TextView>(R.id.tvLikeCount)
        var mCounter = 0

        likebutton.setOnClickListener{
            mCounter ++
            mCounter.toString()
            likecounter.setText(mCounter)

        }
    }


    private fun getUsers(): ArrayList<Users>{
        val users = ArrayList<Users>()

        users.add(Users(
            "Anna",
            icon = BitmapFactory.decodeResource(resources, R.drawable.user1),


        ))
/*
        users.add(Users(
            "Lisa",
            5.toString(),
            icon = BitmapFactory.decodeResource(resources, R.drawable.user2),
            buttonlike = BitmapFactory.decodeResource(resources, R.drawable.user1)
        ))

        users.add(Users(
            "Chad",
            500.toString(),
            icon = BitmapFactory.decodeResource(resources, R.drawable.user3),
            buttonlike = BitmapFactory.decodeResource(resources, R.drawable.user1)
        ))

        users.add(Users(
            "Marcus",
            0.toString(),
            icon = BitmapFactory.decodeResource(resources, R.drawable.user4),
            buttonlike = BitmapFactory.decodeResource(resources, R.drawable.user1)
        ))*/

        return users

    }
}