package com.sumfactor.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {
            MyToast.simpleToast(this, "Toast Message")
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            MyToast.errorToast(this, "error on uploading", Gravity.TOP)
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            MyToast.warningToast(this, "use 'name' in upper case!" , Gravity.CENTER)
        }

    }
}
