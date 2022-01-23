package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.StartPageBinding
import kotlin.math.log
import android.content.Intent
import android.widget.Button

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

        val btn_start_game = findViewById(R.id.button_start_game) as Button
        btn_start_game.setOnClickListener {
            val intent = Intent(this@MainActivity, SovaActivity::class.java)
            startActivity(intent)

        }

//        button.setOnClickListener {
//            val intent = Intent(this@MainActivity, SovaActivity::class.java)
//            startActivity(intent)
//        }
    }

}