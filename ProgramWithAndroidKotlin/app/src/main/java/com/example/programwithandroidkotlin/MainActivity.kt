package com.example.programwithandroidkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val Btn = findViewById<Button>(R.id.btn)

        Btn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }



//    fun SEND_DATA(view: View) {
//        val intent = Intent(Intent(Intent.ACTION_VIEW))
//
//        //startActivity(Intent(intent.setData(Uri.parse("https://github.com/Azamali010"))))
//        startActivity(Intent.createChooser(intent, "Hello Raghib BHai"))
//    }
}