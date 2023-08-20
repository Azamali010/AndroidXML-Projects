package com.example.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Second : AppCompatActivity() {
    private lateinit var textUserName : TextView
    private lateinit var textUserPassword : TextView
    //private lateinit var backbutton :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textUserName = findViewById(R.id.textv1)
        textUserPassword = findViewById(R.id.textv2)
        val username = intent.getStringExtra("username")
        val userpassword = intent.getStringExtra("userpassword")
        textUserName.text= "$username"
        textUserPassword.text = "$userpassword"


       var backbutton=findViewById<Button>(R.id.btn2)
        backbutton.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

            Toast.makeText(this,"BACK Clicked", Toast.LENGTH_SHORT).show()
        }





    }

}