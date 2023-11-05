package com.example.hackaton2023_alarmbutton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023_alarmbutton.databinding.SignLanguageFlowWhatBinding
import com.example.hackaton2023_alarmbutton.databinding.SignLanguageFlowWhereBinding

class SignLanguageFlowWhatActivity : AppCompatActivity() {

    private lateinit var binding: SignLanguageFlowWhatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignLanguageFlowWhatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMedicalEmergency.setOnClickListener { view ->
            val signLanguageFlowWhereActivity = Intent(this, SignLanguageFlowWhereBinding::class.java)
            view.context.startActivity(signLanguageFlowWhereActivity)
        }
    }
}