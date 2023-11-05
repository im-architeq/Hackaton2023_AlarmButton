package com.example.hackaton2023_alarmbutton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023_alarmbutton.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFirst.setOnClickListener { view ->
            val typeOfCommunicationActivity = Intent(this, TypeOfCommunicationActivity::class.java)
            view.context.startActivity(typeOfCommunicationActivity)
        }
    }

}