package com.example.chipgroupkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    lateinit var etProgramacion: EditText
    lateinit var btnAdd: Button
    lateinit var cgLenguajes: ChipGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var vista = layoutInflater.inflate(R.layout.activity_main, null)
        setContentView(vista)

        etProgramacion = findViewById(R.id.etProgramacion)
        btnAdd = findViewById(R.id.btnAdd)
        cgLenguajes = findViewById(R.id.cgLenguajes)

        btnAdd.setOnClickListener {

            val chip = Chip(this)

            chip.text = etProgramacion.text.toString()

            cgLenguajes.addView(chip)

            chip.setOnClickListener(View.OnClickListener {
                Toast.makeText(this, "PRESIONASTE EL CHIP", Toast.LENGTH_LONG).show()
            })


        }
    }
}