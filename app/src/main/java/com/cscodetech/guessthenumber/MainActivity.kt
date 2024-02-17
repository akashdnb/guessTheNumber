package com.cscodetech.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generate(view : View){
        val randomNo = Random.nextInt(1, 100)

        val intent = Intent(this, GuessActivity::class.java)
        intent.putExtra("RANDOM_NO", randomNo)
        startActivity(intent)
    }

}