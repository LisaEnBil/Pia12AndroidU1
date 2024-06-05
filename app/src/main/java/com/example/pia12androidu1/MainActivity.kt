package com.example.pia12androidu1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var changingText = findViewById<TextView>(R.id.showText)

        var changeTextButton = findViewById<Button>(R.id.changeTextButton)

        changeTextButton.setOnClickListener {
            changingText.text = "Good bye"
        }
    }
}




//var minText =  findViewById<TextView>(R.id.fancyText)
//minText.text = "Banan"

//var minKnapp = findViewById<Button>(R.id.button)
//minKnapp.setOnClickListener {
 //   minText.text = "Apelsin"
//}
