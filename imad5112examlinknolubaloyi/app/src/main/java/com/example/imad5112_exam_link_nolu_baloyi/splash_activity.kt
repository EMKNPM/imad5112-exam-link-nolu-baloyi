package com.example.imad5112_exam_link_nolu_baloyi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//ST10478159 Noluthando Baloyi

class splash_activity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_splash)

      //delay for 3 seconds before moving to main activity

      Handler(mainLooper).postDelayed({ val intent = Intent(this, MainActivity::class.java) })
      startActivity(intent)
      finish()
   },3000)
   }
}