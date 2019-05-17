package com.dmjeffmoore.rist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

/* TODO
    2. add ability to remove restaurants
    3. persist restaurants
    4. add ability to cross off restaurants
    5. add ability to rate restaurants
    6. get phone location then add ability to fetch from Google Maps and auto add address and Google rating
    7. add ability to add metadata such as type of food, price, Google rating etc.
    8. add ability to share with other Rist users (export and import)
    9. add ability to sort list by city/area
 */
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
        restaurantText.setText("")

        val listView = findViewById<ListView>(R.id.rest_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurantList)
        listView.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
