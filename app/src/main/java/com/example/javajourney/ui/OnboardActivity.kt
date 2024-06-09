package com.example.javajourney.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.javajourney.R

class OnboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        val mulaiButton: Button = findViewById(R.id.mulai)

        mulaiButton.setOnClickListener {
            navigateToMainActivity()
        }
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
