package com.mihudev.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var resultText: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result_text)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        // Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var currentValue: Int = Integer.parseInt(resultText.text.toString())
            if (currentValue < 6) {
                currentValue++;
                resultText.text = currentValue.toString()
            }
        }
    }

    private fun reset() {
        resultText.text = "0"
    }
}
