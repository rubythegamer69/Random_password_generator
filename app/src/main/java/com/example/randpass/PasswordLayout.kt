package com.example.randpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PasswordLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pass_generator)
        supportActionBar?.hide()
        val genBtn: Button = findViewById(R.id.generate)
        genBtn.setOnClickListener {
            val password = findViewById<TextView>(R.id.genPass)
            password.text = Logic().randPassGen(15)
            //Toast.makeText(this,password.text,Toast.LENGTH_LONG).show()
            val exitBtn: Button = findViewById(R.id.exit)
            exitBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}