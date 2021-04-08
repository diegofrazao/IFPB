package com.example.minhascores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar

class FormActivity : AppCompatActivity() {
    private lateinit var etColorName: EditText
    private lateinit var sbRed: SeekBar
    private lateinit var sbGreen: SeekBar
    private lateinit var sbBlue: SeekBar
    private lateinit var btCode: Button
    private lateinit var btSave: Button
    private lateinit var btCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        this.etColorName = findViewById(R.id.etFormColorName)
        this.sbRed = findViewById(R.id.sbFormRed)
        this.sbGreen = findViewById(R.id.sbFormGreen)
        this.sbRed = findViewById(R.id.sbFormRed)
        this.sbBlue = findViewById(R.id.sbFormBlue)
        this.btCode = findViewById(R.id.btFormCode)
        this.btSave = findViewById(R.id.btFormSave)
        this.btCancel = findViewById(R.id.btFormCancel)

        btCancel.setOnClickListener({ finish() })
    }
}