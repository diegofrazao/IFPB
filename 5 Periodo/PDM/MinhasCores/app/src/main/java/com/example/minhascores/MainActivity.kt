package com.example.minhascores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

private const val ADDCOLOR = 1
class MainActivity : AppCompatActivity() {
    private lateinit var fbAdd: FloatingActionButton
    private lateinit var lvColor: ListView
    private lateinit var colors: ArrayList<Color>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.fbAdd = findViewById(R.id.fbMainAdd)
        this.lvColor = findViewById(R.id.lvMainColors)
        this.colors = ArrayList()
        this.lvColor.adapter = ListViewAdapter(this, this.colors)

        this.colors.add(Color("primeira cor", 255))
        this.colors.add(Color("segunda cor", 253))
        this.colors.add(Color("terceira cor", 234))

        fbAdd.setOnClickListener({ addColor(it) })

    }

    private fun addColor(view: View) {
        val intent = Intent(this, FormActivity::class.java)
        startActivityForResult(intent, ADDCOLOR)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}