package com.arsalan.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn: Button = findViewById(R.id.button)


        btn.setOnClickListener {
//             The roll will start from here
           rollDice()


//

        }


    }
//     Roll the dice and update the screen with the result.
    private fun rollDice() {
    // Create new Dice object with 6 sides and roll the dice

    val dice = Dice(6)
        val diceRol=dice.roll()

        val txt:TextView=findViewById(R.id.num)
        val img: ImageView = findViewById(R.id.imageView)
        val img2: ImageView = findViewById(R.id.imageView2)

    // Determine which drawable resource ID to use based on the dice roll
    val draableImg=when(diceRol){
            1->(R.drawable.dice_1)
            2->(R.drawable.dice_2)
            3->(R.drawable.dice_3)
            4->(R.drawable.dice_4)
            5->(R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }
        img.setImageResource(draableImg)
        img2.setImageResource(draableImg)




        txt.text=diceRol.toString()

    }
//
    }






class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}