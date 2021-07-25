package com.example.smitechooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddFriendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //this screen needs a back button? or there is a mem leak, Run window showing "too much work on main thread currently"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_friend)
    }
}