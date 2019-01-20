package com.deishelon.roundedbottomsheetexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpen = findViewById<Button>(R.id.buttonOpen)
        buttonOpen.setOnClickListener {
            val myRoundedBottomSheet = MyRoundedBottomSheet()
            myRoundedBottomSheet.show(supportFragmentManager, myRoundedBottomSheet.tag)
        }
    }
}
