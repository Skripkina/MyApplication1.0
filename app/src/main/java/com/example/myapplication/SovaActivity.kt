package com.example.myapplication

import android.os.Bundle
import com.example.myapplication.databinding.StartPageBinding
import android.app.Activity

class SovaActivity : Activity(){

    private lateinit var binding: StartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.round_sova)
    }
}