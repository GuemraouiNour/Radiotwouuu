package com.example.radiotwo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var radioGroup: RadioGroup? = null
    var radioButton: RadioButton? = null
    var TextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_apply.setOnClickListener {
            val radioId = RadioGroup.getCheckedRadioButtonId()
            radioButton = findViewById(radioId)
        }
    }

    fun checkButton(v: View?) {
        val radioId = radioGroup!!.checkedRadioButtonId
        radioButton = findViewById(radioId)
        Toast.makeText(this, "Selected radio Button :" + RadioGroup.checkedRadioButtonId.toString(), Toast.LENGTH_SHORT)
            .show()
    }
}