package com.example.hackaton2023_alarmbutton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023_alarmbutton.databinding.SignLanguageFlowWhatBinding
import com.google.android.material.snackbar.Snackbar

class SignLanguageFlowWhatActivity : AppCompatActivity() {

    private lateinit var binding: SignLanguageFlowWhatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignLanguageFlowWhatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMedicalEmergency.setOnClickListener { view ->
            val signLanguageFlowWhereActivity = Intent(this, SignLanguageFlowWhereActivity::class.java)
            view.context.startActivity(signLanguageFlowWhereActivity)
        }

        binding.buttonFire.setOnClickListener { view ->
            val signLanguageFlowWhereActivity = Intent(this, SignLanguageFlowWhereActivity::class.java)
            view.context.startActivity(signLanguageFlowWhereActivity)
        }

        binding.buttonOther.setOnClickListener { view ->
            val signLanguageFlowWhereActivity = Intent(this, SignLanguageFlowWhereActivity::class.java)
            view.context.startActivity(signLanguageFlowWhereActivity)
        }
        binding.buttonViolence.setOnClickListener { view ->
            val signLanguageFlowWhereActivity = Intent(this, SignLanguageFlowWhereActivity::class.java)
            view.context.startActivity(signLanguageFlowWhereActivity)
        }

        binding.buttonCallInSignLanguage.setOnClickListener { view ->
            Snackbar.make(view, "Calling ....", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}