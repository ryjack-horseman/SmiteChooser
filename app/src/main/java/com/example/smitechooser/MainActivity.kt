package com.example.smitechooser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

var friendButton: Button? = null
var startButton: Button? = null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //init layout
        initView()
    }


    fun initView(){
        setContentView(R.layout.activity_main)
        friendButton = findViewById<Button>(R.id.addFriendButton)
        friendButton!!.setOnClickListener(listener)
        startButton = findViewById(R.id.startSessionBtn)
        startButton!!.setOnClickListener(listener)
        //load db to populate the spinner

    }
    val listener= View.OnClickListener { view ->
        when (view.getId()) {
            R.id.addFriendButton -> {
                val intent = Intent(this, AddFriendActivity::class.java)
                startActivity(intent)
            }
            R.id.add_friend_to_session ->{
                //add current spinner name to the list of people in current session
            }
            R.id.startSessionBtn -> {
                //launch session
            }
        }
    }
}

