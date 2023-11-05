package com.example.hackaton2023_alarmbutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023_alarmbutton.databinding.SignLanguageFlowWhereBinding

class SignLanguageFlowWhereActivity : AppCompatActivity() {

    private lateinit var binding: SignLanguageFlowWhereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignLanguageFlowWhereBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}