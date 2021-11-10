package com.example.onefragmentinmainactiviy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.onefragmentinmainactiviy.R

class MyFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_my, container, false)

        val editText = view.findViewById<EditText>(R.id.ed_text)
        val textView = view.findViewById<TextView>(R.id.textView)
        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            textView.text = editText.text
        })

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = MyFragment()
    }
}