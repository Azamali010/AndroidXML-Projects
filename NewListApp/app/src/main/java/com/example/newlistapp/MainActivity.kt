package com.example.newlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val myAdater by lazy { MainListAdapter(this, arrayListOf("1","2","Azam","Bhagatpur","Moradbad")) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.etNewItem).text

        findViewById<Button>(R.id.btnAddItem).setOnClickListener {
            myAdater.addNewItem(et.toString())
        }
        val listView = findViewById<ListView>(R.id.lvItems)

        listView.adapter = myAdater

    }
}