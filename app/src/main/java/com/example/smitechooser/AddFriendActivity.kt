package com.example.smitechooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smitechooser.databinding.ActivityAddFriendBinding
private lateinit var binding: ActivityAddFriendBinding
class AddFriendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // need to add a username field, and then learn how to make database to save and query into
        super.onCreate(savedInstanceState)
        binding = ActivityAddFriendBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //set up FAB
        binding.floatingActionButton.setOnClickListener(btnListener)
    }
    val btnListener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.floatingActionButton -> {
                //add name and username to database if isn't already in database

                // below we have created
                // a new DBHelper class,
                // and passed context to it
                val db = DBHelper(this, null)

                // creating variables for values
                // in name and age edit texts
                val name = binding.editTextTextPersonName.text.toString()
                val gamerTag = binding.gamerTag.text.toString()

                // calling method to add
                // name to our database
                db.addName(name, gamerTag)

                // at last, clearing edit texts
                binding.editTextTextPersonName.text.clear()
                binding.gamerTag.text.clear()
            }
        }
    }
}