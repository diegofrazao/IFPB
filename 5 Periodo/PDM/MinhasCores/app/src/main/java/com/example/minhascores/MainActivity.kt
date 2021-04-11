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
    private lateinit var collors: ArrayList<Collor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.fbAdd = findViewById(R.id.fbMainAdd)
        this.lvColor = findViewById(R.id.lvMainColors)
        this.collors = ArrayList()
        this.lvColor.adapter = ListViewAdapter(this, this.collors)


        this.collors.add(Collor("primeira cor", 255))
        this.collors.add(Collor("segunda cor", 120))
        this.collors.add(Collor("terceira cor", 0))

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