package com.example.minhascores

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(var context: Context, var colors: ArrayList<Collor>): BaseAdapter() {
    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(position: Int): Any {
        return colors[position]
    }

    override fun getItemId(position: Int): Long {
        return -1
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val color = this.colors[position]
        val row: View

        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            row = inflater.inflate(R.layout.row_layout, null)
        }else{
            row = convertView
        }

        val imageColor = row.findViewById<ImageView>(R.id.ivAdapterImageColor)
        val colorName = row.findViewById<TextView>(R.id.tvAdpaterColorName)
        val colorCode = row.findViewById<TextView>(R.id.tvAdpaterColorCode)
        val ccode = colors[position].toHex()

        colorName.text = color.name
        colorCode.text = String.format("#%02X", (0xFF and color.code))

        return row
    }
}