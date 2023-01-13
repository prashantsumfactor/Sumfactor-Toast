package com.sumfactor.mytoast

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

object MyToast {

    fun simpleToast(context: Context, simpleMessage: String, position: Int = Gravity.BOTTOM) {
        val getToast = getToast(context = context, message = simpleMessage, color = "#FAFAFA")
        getToast.setGravity(position, 0, 0)
        getToast.show()
    }

    fun warningToast(context: Context, warningMessage: String, position: Int = Gravity.BOTTOM) {
        val getToast = getToast(context = context, message = warningMessage, color = "#FFC107")
        getToast.setGravity(position, 0, 0)
        getToast.show()
    }

    fun errorToast(context: Context, errorMessage: String, position: Int = Gravity.BOTTOM) {
        val getToast = getToast(context = context, message = errorMessage, color = "#FF5722")
        getToast.setGravity(position, 0, 0)
        getToast.show()
    }

    private fun getToast(context: Context, message: String, color: String): Toast {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.toast_custom_layout,null)
        val textView = view.findViewById<TextView>(R.id.toast_message)
        textView.text = message
        textView.setBackgroundColor(Color.parseColor(color))
        toast.view = view
        return toast
    }


}