package com.example.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val projects = findViewById<android.widget.Button>(R.id.buttonProjects)
        projects.setOnClickListener {
            val intent = Intent(this, Projects::class.java)
            startActivity(intent)
        }
        val resume = findViewById<android.widget.Button>(R.id.buttonCV)
        resume.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1R_TWqoB1Nw9A2UJROuPMbEW0pbdrVMyY"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val email = findViewById<android.widget.Button>(R.id.buttonEmail)
        email.setOnClickListener {
            val url = "mailto:dishachaudhary76@gmail.com"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val github = findViewById<ImageView>(R.id.imageView1)
        github.setOnClickListener {
            val url = "https://github.com/Disha-05"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val linkedin = findViewById<ImageView>(R.id.imageView2)
        linkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/disha-chaudhary-5bb5571b4"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
    }
}