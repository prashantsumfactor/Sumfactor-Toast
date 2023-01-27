package com.sumfactor.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {
            // use this without mention default position on toast
            MyToast.simpleToast(this, "Toast Message")
            // or use this with mentioning 'default' position of toast into bottom
            MyToast.simpleToast(this, "Toast Message", MyToast.positionDefault)

        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            // Error toast message with 'top' position
            MyToast.errorToast(this, "Error on uploading", MyToast.positionTop)
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            // Warning toast message with 'center' position
            MyToast.warningToast(this, "Use 'name' in upper case!", MyToast.positionCenter)
        }

    }
}
