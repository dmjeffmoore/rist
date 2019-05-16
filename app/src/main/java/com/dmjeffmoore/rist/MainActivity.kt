package com.dmjeffmoore.rist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    var restaurantList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.rest_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurantList)
        listView.adapter = adapter
    }

    fun addRestaurant(view: View) {
        val restaurantText = findViewById<EditText>(R.id.restaurant_input)
        val restaurant = restaurantText.text.toString()
        restaurantList.add(restaurant)

        val listView = findViewById<ListView>(R.id.rest_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurantList)
        listView.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
