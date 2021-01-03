package com.khoirulfajri.model9view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textView.text = viewModel.number.toString()

        button.setOnClickListener {
            viewModel.addNumber()
            textView.text = viewModel.number.toString()
        }
    }
}