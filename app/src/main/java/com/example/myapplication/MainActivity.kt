package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.StartPageBinding
import kotlin.math.log
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: StartPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = StartPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        with(binding){
//            button.setOnClickListener {
//                Toast.makeText(applicationContext,"CORRECT!",Toast.LENGTH_SHORT).show()
//            }
//        }
    }

    fun onClickStartGame() {
        Intent(this, SovaActivity::class.java)
    }

}