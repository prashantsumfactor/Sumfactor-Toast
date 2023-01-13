package com.sumfactor.mytoast

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

object MyToast {
    fun showToast(context: Context, message: String, type: Int = 1) {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.toast_custom_layout, null)
        val textView = view.findViewById<TextView>(R.id.toast_message)
        textView.text = message
        toast.view = view
        toast.setGravity(Gravity.TOP, 0, 0)
        when (type) {
            1 -> textView.setBackgroundColor(Color.parseColor("#D4D4D4"))
            2 -> textView.setBackgroundColor(Color.parseColor("#E66161"))
            else -> textView.setBackgroundColor(Color.parseColor("#D4D4D4"))
        }
        toast.show()
    }

    fun warningToast(context: Context, warningMessage: String, position: Int) {

    }

    fun errorToast(context: Context, warningMessage: String, position: Int) {

    }
}