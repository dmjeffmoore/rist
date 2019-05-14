package com.dmjeffmoore.rist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.dmjeffmoore.rist.MESSSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addRestaurant(view: View) {
        val restaurantText = findViewById<EditText>(R.id.restaurant_input)
        val restaurant = restaurantText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, restaurant)
        }
        startActivity(intent)
    }

}
