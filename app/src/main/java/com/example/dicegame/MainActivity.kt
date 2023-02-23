package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random




class MainActivity : AppCompatActivity() {
    lateinit var imageDiceRoll: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageDiceRoll = findViewById(R.id.image_dice_roll)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            roll()
        }

    }

    private fun roll() {

        val drawableResource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.one__1_
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six

        }

        imageDiceRoll.setImageResource(drawableResource)

    }
}