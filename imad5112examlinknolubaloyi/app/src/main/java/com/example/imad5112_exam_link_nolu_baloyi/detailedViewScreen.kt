package com.example.imad5112_exam_link_nolu_baloyi

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailedViewScreen : AppCompatActivity() {
    //declarations
    private lateinit var gearListContainer : LinearLayout
    private lateinit var backBtn : Button
    private lateinit var scrollView: ScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        //typecasting
        gearListContainer = findViewById(R.id.gearListContainer)
        backBtn = findViewById(R.id.backBtn)
        scrollView = findViewById(scrollView)

        displayGearList()

        backBtn.setOnClickListener {
            finish() //Navigate back to Main Screen
        }
    }

    private fun displayGearList() {
        gearListContainer.removeAllViews()

        //using loop to display all gear items
        for (i < MainActivity.itemNames.indices) {
            val gearCard = createGearCard(
                MainActivity.itemNames[i],
                MainActivity.categories[i],
                MainActivity.quantities[i],
                MainActivity.comments[i]
            )
            gearListContainer.addView(gearCard)}

            //adding divider between items
            if (i < MainActivity.itemNames.size - 1) {
                val divider = view(this).apply{
                    layoutParams.MATCH_PARENT, 2
                    )
                    setBackgroundColor(ContextCompat.getColor(context, android.R.color.darker_gray()))
                }
            }
            //show message if no items
            if (MainActivity.itemNames.isEmpty()) {
                val emptyTextView = TextView(this).apply {
                    text = "no gear items added yet.\nTap  'add gear' to get started!"
                    textSize = 16f
                    setPadding((50, 100, 50, 100)
                    gravity = android.view.Gravity.CENTER)

                }
            }

            private fun createGearCard(itemName: ParameterName)
        }
    }


}