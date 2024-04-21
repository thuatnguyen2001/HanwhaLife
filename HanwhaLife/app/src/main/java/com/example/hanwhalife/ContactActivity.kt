package com.example.hanwhalife

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ContactActivity : AppCompatActivity() {
    lateinit var btnBack:ImageButton
    lateinit var btnCall:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        anhXa()
        addEvent()
    }

    private fun addEvent() {
        btnBack.setOnClickListener {
            finish()
        }

        val phoneNumber = "0987654321"
        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }
    }

    private fun anhXa() {
        btnBack = findViewById(R.id.btnBack)
        btnCall = findViewById(R.id.btnCall)
    }
}