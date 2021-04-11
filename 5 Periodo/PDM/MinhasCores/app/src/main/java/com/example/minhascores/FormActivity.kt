package com.example.minhascores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import kotlin.text.*

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

        sbRed.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val progressRed = String.format("#%02X", (0xFF and progress))
                val progressGreen = String.format("%02X", (0xFF and sbGreen.progress))
                val progressBlue = String.format("%02X", (0xFF and sbBlue.progress))
                btCode.text = "${progressRed}${progressGreen}${progressBlue}"
                btCode.setBackgroundColor(255)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        sbGreen.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val progressRed = String.format("#%02X", (0xFF and sbRed.progress))
                val progressGreen = String.format("%02X", (0xFF and progress))
                val progressBlue = String.format("%02X", (0xFF and sbBlue.progress))
                btCode.text = "${progressRed}${progressGreen}${progressBlue}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        sbBlue.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val progressRed = String.format("#%02X", (0xFF and sbRed.progress))
                val progressGreen = String.format("%02X", (0xFF and sbGreen.progress))
                val progressBlue = String.format("%02X", (0xFF and progress))
                btCode.text = "${progressRed}${progressGreen}${progressBlue}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        btCancel.setOnClickListener { finish() }
    }
}