package com.forkan.smsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class UpdateFieldActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_field)

        val spinnerFieldType: Spinner = findViewById(R.id.field_type_spinner);
        val spinnerFieldAssigned: Spinner = findViewById(R.id.assigned_field_spinner);

        ArrayAdapter.createFromResource(
            this,
            R.array.field_type_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerFieldType.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.assigned_field_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerFieldAssigned.adapter = adapter
        }

        spinnerFieldType.onItemSelectedListener = this
        spinnerFieldAssigned.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}