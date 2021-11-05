package com.example.randpass


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btn: Button = findViewById(R.id.Clicker)
        btn.setOnClickListener {
            val intent = Intent(this, PasswordLayout::class.java)
            startActivity(intent)
        }
    }
}

/*object : View.OnClickListener{
        override fun onClick(v: View?) {
            Toast.makeText(this@MainActivity,Logic().randPassGen(34),Toast.LENGTH_LONG).show();*/

