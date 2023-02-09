package com.example.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Projects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        val project1 = findViewById<android.widget.Button>(R.id.portfolioapp)
        project1.setOnClickListener {
            val url = "https://github.com/Disha-05/portfolio_disha"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project2 = findViewById<android.widget.Button>(R.id.loginapp)
        project2.setOnClickListener {
            val url = "https://github.com/Disha-05/LoginApp"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project3 = findViewById<android.widget.Button>(R.id.appdesign)
        project3.setOnClickListener {
            val url = "https://www.figma.com/proto/KJ9r58xuzKlqjFG1k27Rxm/Untitled?page-id=0%3A1&node-id=1%3A2&viewport=726%2C509%2C1.19&scaling=scale-down"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project4 = findViewById<android.widget.Button>(R.id.webdesign)
        project4.setOnClickListener {
            val url = "https://www.figma.com/proto/sWuf4uzNWRY9zuZPsHcOY5/Untitled?node-id=1%3A2"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
    }
}