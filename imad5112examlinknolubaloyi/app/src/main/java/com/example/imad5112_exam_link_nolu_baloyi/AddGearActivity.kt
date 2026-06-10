package com.example.imad5112_exam_link_nolu_baloyi

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddGearActivity : AppCompatActivity() {
    private lateinit var itemName: EditText
    private lateinit var category: Spinner
    private lateinit var quantity: EditText
    private lateinit var comments: EditText
    private lateinit var saveBtn: Button
    private lateinit var cancelBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_gear)

        //linking UI elements
        itemName = findViewById(R.id.itemName)
        category = findViewById(R.id.category)
        quantity = findViewById(R.id.quantity)
        comments = findViewById(R.id.comments)
        saveBtn = findViewById(R.id.comments)
        cancelBtn = findViewById(R.id.cancelBtn)


        //category spinner
        val categories = arrayOf("Shelter", "Food", "Safety",)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        val categorySpinner = null
        categorySpinner.adapter = adapter

        saveBtn.setOnClickListener {
            saveGearItem()
        }

        cancelBtn.setOnClickListener {
            finish()
        }
    }

    private fun saveGearItem(add: Any.(String) -> Unit) {
        val itemName = itemName.text.toString().trim()
        val categorySpinner = null
        val category = categorySpinner.toString()
        val quantity: String = quantity.text.toString().trim()
        val comments = comments.text.toString().trim()


        //validation
        if (itemName.isEmpty()) {
            Toast.makeText(this, "Please enter item name", Toast.LENGTH_SHORT).show()
            return
        }

        if (quantity.isEmpty()) {
            Toast.makeText(this, "Please enter quantity", Toast.LENGTH_SHORT).show()
            return
        }
        if(quantity == null || quantity <= 0.toString()) {
            Toast.makeText(this, "Please enter valid quantity", Toast.LENGTH_SHORT).show()
            return
        }

        //parallel arrays
        MainActivity.itemNames.add(itemName)
        MainActivity.categories.add(category)
        MainActivity.quantities.add(quantity)
        MainActivity.comments.add(if (comments.isEmpty()) "no comments" else comments)

        Toast.makeText(this, "Gear added successfully", Toast.LENGTH_SHORT).show()
        finish()
    }


    }
