package com.example.imad5112_exam_link_nolu_baloyi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//ST10478159 Noluthando Baloyi

class MainActivity : AppCompatActivity() {
    //declarations

    private lateinit var totalItem: TextView
    private lateinit var addGear: Button
    private lateinit var viewList: Button

    //parallel arrays
    val itemName = mutableListOf("Tent", "Marshmallows", "Flashlight", "Sleeping bag", "FirstAid kit")
    val categories = mutableListOf("Shelter", "Food", "Safety")
    val quantity = mutableListOf(1, 3, 2, 2, 1,1)
    val comments = mutableListOf("4-person waterproof", "For S'mores(Mega size)", "Check batteries(AA)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //dark mode/nature theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

      //typecasting/linking UI elements

        totalItem = findViewById(R.id.totalItem)
        addGear = findViewById(R.id.addGear)
        viewList = findViewById(R.id.viewList)

        //update totalItems
        updateTotalItems()

        addGear.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)

            viewList.setOnClickListener {
                val intent = Intent(this, DetailedViewActivity::class.java)
                startActivity(intent)


                fun onResume() {
                    super.onResume()
                    updateTotalItems()

                }
                fun updatetotalItems() {
                    //using loop to calculate total items packed
                    var totalItems = 0
                    for (quantity in quantity) {
                        totalItems += quantity
                    }
                    totalItems.toString() = "Total items Packed: $totalItems"
                }
            }
        }


    }

    private fun updateTotalItems() {
        TODO("Not yet implemented")
    }

    companion object {
        val comments: Any
        val quantities: Any
        val categories: Any
        val itemNames: Any
    }
}
