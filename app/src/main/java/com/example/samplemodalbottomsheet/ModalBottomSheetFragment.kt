package com.example.samplemodalbottomsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * A simple [Fragment] subclass.
 * Use the [ModalBottomSheetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ModalBottomSheetFragment : BottomSheetDialogFragment()
{
    companion object
    {
        const val TAG_ACTIVITY = "SampleActivity"
        const val TAG_FRAGMENT = "SampleFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modal_bottom_sheet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?)
    {
        super.onActivityCreated(savedInstanceState)

        val shareButton = view?.findViewById<Button>(R.id.share)
        val linkButton = view?.findViewById<Button>(R.id.link)
        val editButton = view?.findViewById<Button>(R.id.edit)


        shareButton?.setOnClickListener {
            //handle click event
            Toast.makeText(context, "First Button Clicked", Toast.LENGTH_SHORT).show()
        }
        linkButton?.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Second Button Clicked", Toast.LENGTH_SHORT).show()
        }
        editButton?.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Third Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}