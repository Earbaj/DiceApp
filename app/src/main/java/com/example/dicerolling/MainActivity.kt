package com.example.dicerolling

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img_dice : ImageView
    lateinit var btn_roll : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img_dice = findViewById(R.id.img_dice)
        btn_roll = findViewById(R.id.btn_roll)
        btn_roll.setOnClickListener { DiceRoll() }
    }

    private fun DiceRoll(){
        var random_num = (1..6).random()
        var drawable = when(random_num){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img_dice.setImageResource(drawable)
    }
}