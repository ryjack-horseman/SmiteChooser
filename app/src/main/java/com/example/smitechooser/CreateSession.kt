package com.example.smitechooser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.smitechooser.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding



class CreateSession : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //init layout
        initView()
    }


    fun initView(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.addFriendButton.setOnClickListener(btnListener)
        binding.startSessionBtn.setOnClickListener(btnListener)
        //load db to populate the spinner

    }
    val btnListener= View.OnClickListener { view ->
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

