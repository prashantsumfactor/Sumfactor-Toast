package com.sumfactor.mytoast

import android.content.Context
import android.widget.Toast

object MyToast {
    fun showToast(context: Context, message: String, type: Int = 1) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}