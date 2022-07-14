package com.forkan.smsapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class DataShowActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_show)

        val spinnerField: Spinner = findViewById(R.id.select_field_spinner);
        val spinnerTable: Spinner = findViewById(R.id.table_select_spinner);
        val spinnerInclude: Spinner = findViewById(R.id.include_spinner);

        ArrayAdapter.createFromResource(
            this,
            R.array.field_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerField.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.table_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTable.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.include_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerInclude.adapter = adapter
        }

        spinnerField.onItemSelectedListener = this
        spinnerTable.onItemSelectedListener = this
        spinnerInclude.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}