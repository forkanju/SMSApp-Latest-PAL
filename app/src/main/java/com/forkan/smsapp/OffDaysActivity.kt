package com.forkan.smsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class OffDaysActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_off_days)

        val createOffDays: AppCompatButton = findViewById(R.id.create_off_days_btn);
        val viewOffDays: AppCompatButton = findViewById(R.id.view_off_days_btn);

        createOffDays.setOnClickListener {
            val intent = Intent(this, CreateOffDaysActivity::class.java)
            startActivity(intent)
        }

        viewOffDays.setOnClickListener {
            val intent = Intent(this, ShowOffDaysActivity::class.java)
            startActivity(intent)
        }




    }
}