package com.example.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private  lateinit var BtnSendData : Button
    private lateinit var UserName : EditText
    private lateinit var UesrPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnSendData = findViewById(R.id.btn1)
        UserName = findViewById(R.id.edittext1)
        UesrPassword = findViewById(R.id.edittext2)

        BtnSendData.setOnClickListener {
            startActivity(Intent(this,Second::class.java)
                .putExtra("username",UserName.text.toString())
                .putExtra("userpassword",UesrPassword.text.toString()))

            Toast.makeText(this,"NEXT Clicked", Toast.LENGTH_SHORT).show()


        }
    }
}