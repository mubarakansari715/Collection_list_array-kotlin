package com.example.collection_list_array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    var lang = arrayOf("Android", "PHP","Kotlin", "React", "Android", "PHP", "React", "Android", "PHP","kotlin", "React")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<GridView>(R.id.list_item)

        val adapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,lang)
        list.setAdapter(adapter)
        list.setOnItemClickListener { parent, view, position, id -> Toast.makeText(this,lang[position],Toast.LENGTH_SHORT).show()  }
    }
}