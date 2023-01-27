package com.sumfactor.mytoast

import android.app.Activity
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

object MyToast {

    // TODO : Define toast position
    const val positionDefault: Int = Gravity.BOTTOM
    const val positionCenter: Int = Gravity.CENTER
    const val positionTop: Int = Gravity.TOP

    // TODO : Create a simple toast with default ( Bottom ) position
    fun simpleToast(context: Activity, simpleMessage: String, position: Int = positionDefault) {
        val getToast =
            getToast(context = context, message = simpleMessage, color = "#FAFAFA", iconIndex = 0)
        getToast.setGravity(isValidPosition(position), 0, 0)
        getToast.show()
    }

    // TODO : Create a warning toast with default ( Bottom ) position
    fun warningToast(context: Activity, warningMessage: String, position: Int = positionDefault) {
        val getToast =
            getToast(context = context, message = warningMessage, color = "#FFC107", iconIndex = 1)
        getToast.setGravity(isValidPosition(position), 0, 0)
        getToast.show()
    }

    // TODO : Create a Error toast with default ( Bottom ) position
    fun errorToast(context: Activity, errorMessage: String, position: Int = positionDefault) {
        val getToast =
            getToast(context = context, message = errorMessage, color = "#F44336", iconIndex = 2)
        getToast.setGravity(isValidPosition(position), 0, 0)
        getToast.show()
    }

    // TODO : Get Toast with custom layout and textview
    private fun getToast(context: Activity, message: String, color: String, iconIndex: Int): Toast {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT

        // val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val inflater = context.layoutInflater

        val view: View = inflater.inflate(R.layout.toast_custom_layout, null)
        val textView = view.findViewById<TextView>(R.id.toast_message)
        val icon = view.findViewById<ImageView>(R.id.toast_logo)
        val toastBox = view.findViewById<LinearLayout>(R.id.toast_box)
        when (iconIndex) {
            0 -> icon.visibility = View.GONE
            1 -> icon.setImageResource(R.drawable.warning)
            else -> icon.setImageResource(R.drawable.error)
        }
        textView.text = message
        toastBox.setBackgroundColor(Color.parseColor(color))
        toast.view = view
        return toast
    }

    // TODO : Checking pos value id valid or not
    private fun isValidPosition(pos: Int): Int {
        val isValid: Boolean = pos == positionDefault || pos == positionCenter || pos == positionTop
        return if (isValid) pos else positionDefault
    }

}