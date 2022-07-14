package com.forkan.smsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FieldsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fields)

        val action: TextView = findViewById(R.id.action_);

        action.setOnClickListener {
            val intent = Intent(this, UpdateFieldActivity::class.java)
            startActivity(intent)
        }
    }
}