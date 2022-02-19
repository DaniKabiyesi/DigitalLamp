package com.studying.challenge3

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textview.MaterialTextView
import com.studying.challenge3.databinding.ActivityLampBinding

class LampActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLampBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLampBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val backgroundImage = binding.constraintId
        val editTextView = binding.editableTextView
        val editImageView = binding.genericImageView

        binding.btnTurnOn.setOnClickListener {
            changeToModeOn(backgroundImage, editTextView, editImageView)

        }

        binding.btnTurnOff.setOnClickListener {
            changeToModeOff(backgroundImage, editTextView, editImageView)

        }
    }

    private fun changeToModeOn(
        backgroundImage: ConstraintLayout,
        editTextView: MaterialTextView,
        editImageView: ImageView
    ) {
        backgroundImage.setBackgroundResource(R.drawable.gradient_background_on)
        editTextView.setTextColor(getColor(R.color.white))
        editTextView.text = getString(R.string.turnOn)
        editImageView.setImageResource(R.drawable.lamp_image_on)
        Toast.makeText(this, "Ligado!", Toast.LENGTH_SHORT).show()
    }

    private fun changeToModeOff(
        backgroundImage: ConstraintLayout,
        editTextView: MaterialTextView,
        editImageView: ImageView
    ) {
        backgroundImage.setBackgroundResource(R.drawable.gradient_background_off)
        editTextView.text = getString(R.string.turnOff)
        editTextView.setTextColor(getColor(R.color.secondary_color))
        editImageView.setImageResource(R.drawable.lamp_image_off)
        Toast.makeText(this, "Desligado!", Toast.LENGTH_SHORT).show()
    }

}

