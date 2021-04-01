package com.example.samplemodalbottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modalSheet = findViewById<Button>(R.id.modal_bottom_sheet)

        // Bottom Sheet Dialog
        modalSheet.setOnClickListener {
            ModalBottomSheetFragment().apply {
                show(supportFragmentManager, ModalBottomSheetFragment.TAG_ACTIVITY)
            }
        }
    }
}