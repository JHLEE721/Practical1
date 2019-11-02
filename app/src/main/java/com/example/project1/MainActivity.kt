package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView
    var num = 1
    val total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        //val countUp: Button = findViewById(R.id.count_up)

        //val count: TextView = findViewById(R.id.total)

        rollButton.setOnClickListener { rollDice()}
        //countUp.setOnClickListener { countDice() }


        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

    }

    private fun rollDice(){
        Toast.makeText(this, "Button Clicked",
            Toast.LENGTH_SHORT).show()

        val count: TextView = findViewById(R.id.total)
        val countNum = num
        count.text = "Count :" + countNum.toString()

        //val totalNum: TextView = findViewById(R.id.totalNum)

        diceImage1.setImageResource(randomDice())
        diceImage2.setImageResource(randomDice())
        diceImage3.setImageResource(randomDice())
        num++

    }

    private fun countDice(){

    }

    private fun randomDice() : Int{
        val newNumber = Random.nextInt(6) + 1

        return when (newNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }

}
