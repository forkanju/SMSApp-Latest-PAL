package com.forkan.smsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView

class SlotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slot)

        val createSlot: AppCompatButton = findViewById(R.id.create_slot_btn);
        val viewSlot: AppCompatButton = findViewById(R.id.view_slot_btn);

        createSlot.setOnClickListener {
            val intent = Intent(this, CreateSlotActivity::class.java)
            startActivity(intent)
        }

        viewSlot.setOnClickListener {
            val intent = Intent(this, ViewSlotsActivity::class.java)
            startActivity(intent)
        }
    }
}