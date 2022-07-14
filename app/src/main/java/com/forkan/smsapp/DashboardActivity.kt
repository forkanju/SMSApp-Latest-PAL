package com.forkan.smsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val createField: CardView = findViewById(R.id.createField);
        val dataShow: CardView = findViewById(R.id.dataShow);
        val counselor: CardView = findViewById(R.id.counselor);
        val slot: CardView = findViewById(R.id.slot);
        val offDays: CardView = findViewById(R.id.off_days);

        createField.setOnClickListener {
            val intent = Intent(this, CreateFieldActivity::class.java)
            startActivity(intent)
        }

        dataShow.setOnClickListener {
            val intent = Intent(this, DataShowActivity::class.java)
            startActivity(intent)
        }

        counselor.setOnClickListener {
            val intent = Intent(this, CreateCounselorActivity::class.java)
            startActivity(intent)
        }

        slot.setOnClickListener {
            val intent = Intent(this, SlotActivity::class.java)
            startActivity(intent)
        }

        offDays.setOnClickListener {
            val intent = Intent(this, OffDaysActivity::class.java)
            startActivity(intent)
        }
    }
}