package com.example.hackaton2023_alarmbutton

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.hackaton2023_alarmbutton.databinding.TypeOfCommunicationBinding

class TypeOfCommunicationActivity : AppCompatActivity() {

    private lateinit var binding: TypeOfCommunicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TypeOfCommunicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPhoneCall.setOnClickListener { view ->
            Snackbar.make(view, "Make a phone call", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


        binding.buttonSignLanguage.setOnClickListener { view ->
            Snackbar.make(view, "Make a signing session", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        binding.buttonSignLanguage.setOnClickListener { view ->
            val signLanguageFlowWhatActivity = Intent(this, SignLanguageFlowWhatActivity::class.java)
            view.context.startActivity(signLanguageFlowWhatActivity)
        }

        binding.buttonText.setOnClickListener { view ->
            Snackbar.make(view, "Make a text message", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}