package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    var Array = arrayOf("AAA","BBB","CCC",)

    private lateinit var  newRecylview : RecyclerView
    private  lateinit var  newArrayList : ArrayList<News>
    lateinit var ImageId : Array<Int>
    lateinit var  heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Array)
//        var listView = findViewById<ListView>(R.id.list_view)
//        listView.adapter = adapter
    }
}