package com.example.mytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // finded the ID of Butthon and EditText
        val start_btn = findViewById<Button>(R.id.start_bnt)
        var input_number = findViewById<EditText>(R.id.input_number)

        // OnClickeLister is Started from here
        start_btn.setOnClickListener {
            // intent it goes from MainActivity to ShapeActivity
            var inputNum = input_number.text.toString().toInt()
            if (inputNum>=10){
                val intent = Intent(this,ShapeActivity::class.java)
                intent.putExtra("input_num",inputNum)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Enter the number 10 or grater than 10 ", Toast.LENGTH_SHORT).show()
            }
        }

    }
}