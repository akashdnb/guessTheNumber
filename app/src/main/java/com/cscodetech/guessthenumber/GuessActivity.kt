package com.cscodetech.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class GuessActivity : AppCompatActivity() {
    private lateinit var inputEt: EditText
    private lateinit var checkBtn: Button
    private lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess)

        inputEt = findViewById(R.id.editTextText)
        checkBtn = findViewById(R.id.button2)
        resultTv = findViewById(R.id.textView3)

        val randomNo = intent?.getIntExtra("RANDOM_NO", 1) ?: 1

        checkBtn.setOnClickListener{
            val input = inputEt.text.toString()
            val number = input.toIntOrNull()
            if(number == null){
                resultTv.text = "Please Enter a Number"
            }
            else if(number > randomNo){
                resultTv.text = "Your guess is greater"
            }
            else if(number < randomNo){
                resultTv.text = "Your guess is smaller"
            }
            else{
                resultTv.text = "Congratulations!! You have guessed the number!"
                Toast.makeText(this, "Congratulations!!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}