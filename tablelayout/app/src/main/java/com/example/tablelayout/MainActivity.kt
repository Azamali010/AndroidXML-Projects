package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    var flag = 0
    var count =0

    private  lateinit var  B1 : Button
    private  lateinit var  B2 : Button
    private  lateinit var  B3 : Button
    private  lateinit var  B4 : Button
    private  lateinit var  B5 : Button
    private  lateinit var  B6 : Button
    private  lateinit var  B7 : Button
    private  lateinit var  B8 : Button
    private  lateinit var  B9 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun check(view: View) {
        val  btncurr = view as Button
        if (btncurr.text == " ") {
            count++

            if (flag == 0) {
                btncurr.text = "X"
                flag = 1
            } else {
                btncurr.text = "0"
                flag = 0;
            }
        }
        B1 = findViewById(R.id.btn1)
        B2 = findViewById(R.id.btn2)
        B3 = findViewById(R.id.btn3)
        B4 = findViewById(R.id.btn4)
        B5 = findViewById(R.id.btn5)
        B6 = findViewById(R.id.btn6)
        B7 = findViewById(R.id.btn7)
        B8 = findViewById(R.id.btn8)
        B9 = findViewById(R.id.btn9)

        val b1 = B1.text.toString()
        val b2 = B2.text.toString()
        val b3 = B3.text.toString()
        val b4 = B4.text.toString()
        val b5 = B5.text.toString()
        val b6 = B6.text.toString()
        val b7 = B7.text.toString()
        val b8 = B8.text.toString()
        val b9 = B9.text.toString()

        if (b1 == b2 && b2 == b3 && b3!=" "){
            Toast.makeText(this@MainActivity, "Winner Is: $b1", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b4 == b5 && b5 == b6 && b6 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b4", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b7 == b8 && b8 == b9 && b9 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b7", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b1 == b4 && b4 == b7 && b7 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b1", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b2 == b5 && b5 == b8 && b8 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b2", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b3 == b6 && b6 == b9 && b9 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b3", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b3 == b5 && b5 == b7 && b7 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b3", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (b9 == b5 && b5 == b1 && b1 != " "){
            Toast.makeText(this@MainActivity, "Winner Is: $b9", Toast.LENGTH_LONG).show()
            NewGame()
        }
        else if (count == 9){
            Toast.makeText(this@MainActivity, "Draw", Toast.LENGTH_LONG).show()
            NewGame()
        }
    }
    fun  NewGame(){
        B1.text = " "
        B2.text = " "
        B3.text = " "
        B4.text = " "
        B5.text = " "
        B6.text = " "
        B7.text = " "
        B8.text = " "
        B9.text = " "
        flag = 0
        count = 0
    }
}