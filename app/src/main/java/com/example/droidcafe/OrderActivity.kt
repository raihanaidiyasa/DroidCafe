package com.example.droidcafe

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        val cityspinner = findViewById<Spinner>(R.id.city_spinner)
        val selectedcity = cityspinner.selectedItem.toString()

        val note = findViewById<EditText>(R.id.note_text)
        val notes_text = note.text.toString()
    }
    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
            R.id.sameday -> if (checked)
                displayToast(getString(R.string.same_day_messenger_service))

            R.id.nextday -> if (checked)
                displayToast(getString(R.string.next_day_ground_delivery))

            R.id.pickup -> if (checked)
                displayToast(getString(R.string.pick_up))

            else -> {}
        }

    }
    private fun displayToast(message: String) {
        Toast.makeText(
            applicationContext, message,
            Toast.LENGTH_SHORT
        ).show()
    }
}