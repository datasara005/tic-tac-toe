package com.example.iqsidanuli

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.Ringtone
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintSet.Layout
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var x0: Button
    lateinit var x1: Button
    lateinit var x2: Button
    lateinit var x3: Button
    lateinit var x4: Button
    lateinit var x5: Button
    lateinit var x6: Button
    lateinit var x7: Button
    lateinit var x8: Button

    lateinit var erti: TextView
    lateinit var ori: TextView

    lateinit var reset: TextView

    lateinit var player: TextView

    var activoba = true

    var mogebuli = 0

    var angarishi1 = 0
    var angarishi2 = 0

    var player1 = 0
    var player2 = 1
    var activeplayer = player1
    lateinit var archeuli: IntArray


    lateinit var change:TextView


    lateinit var saxeli1:TextInputEditText
    lateinit var saxeli2:TextInputEditText
    lateinit var dadastureba: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        archeuli = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)
        change=findViewById(R.id.change)
        change.setOnClickListener {
            setContentView(R.layout.saxeli)
            saxeli1=findViewById(R.id.name1)
            saxeli2=findViewById(R.id.name2)
            dadastureba=findViewById(R.id.dadastureba)
            dadastureba.setOnClickListener {
                if(saxeli1.length()>0 && saxeli2.length()>0 ){
                    setContentView(R.layout.activity_main)
                    x0 = findViewById(R.id.x0)
                    x1 = findViewById(R.id.x1)
                    x2 = findViewById(R.id.x2)
                    x3 = findViewById(R.id.x3)
                    x4 = findViewById(R.id.x4)
                    x5 = findViewById(R.id.x5)
                    x6 = findViewById(R.id.x6)
                    x7 = findViewById(R.id.x7)
                    x8 = findViewById(R.id.x8)

                    erti = findViewById(R.id.erti)
                    ori = findViewById(R.id.ori)

                    reset = findViewById(R.id.reset)


                    player = findViewById(R.id.player)






                    x0.setOnClickListener(this)
                    x1.setOnClickListener(this)
                    x2.setOnClickListener(this)
                    x3.setOnClickListener(this)
                    x4.setOnClickListener(this)
                    x5.setOnClickListener(this)
                    x6.setOnClickListener(this)
                    x7.setOnClickListener(this)
                    x8.setOnClickListener(this)






                }
            }
        }




        x0 = findViewById(R.id.x0)
        x1 = findViewById(R.id.x1)
        x2 = findViewById(R.id.x2)
        x3 = findViewById(R.id.x3)
        x4 = findViewById(R.id.x4)
        x5 = findViewById(R.id.x5)
        x6 = findViewById(R.id.x6)
        x7 = findViewById(R.id.x7)
        x8 = findViewById(R.id.x8)

        erti = findViewById(R.id.erti)
        ori = findViewById(R.id.ori)

        reset = findViewById(R.id.reset)


        player = findViewById(R.id.player)






        x0.setOnClickListener(this)
        x1.setOnClickListener(this)
        x2.setOnClickListener(this)
        x3.setOnClickListener(this)
        x4.setOnClickListener(this)
        x5.setOnClickListener(this)
        x6.setOnClickListener(this)
        x7.setOnClickListener(this)
        x8.setOnClickListener(this)




    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onClick(v: View?) {


        if (!activoba)
            return

        var dawerili = findViewById<Button>(v!!.id)
        var dawrilitagi = Integer.parseInt(dawerili.tag.toString())
        if (archeuli[dawrilitagi] != -1)
            return


        archeuli[dawrilitagi] = activeplayer


        if (activeplayer == player1) {
            dawerili.setText("O")
            activeplayer = player2
            if(saxeli1.length()>0 && saxeli2.length()>0 ){
                player.setText(saxeli2.text.toString())

            }
            else{
                player.setText("მოთამაშე 2")
            }

            dawerili.setTextColor(Color.BLACK)
            dawerili.backgroundTintList = getColorStateList(R.color.yellow)
            mogeba()
        } else if (activeplayer == player2) {
            dawerili.setText("X")
            activeplayer = player1
            if(saxeli1.length()>0 && saxeli2.length()>0 ){
                player.setText(saxeli1.text.toString())

            }
            else{
                player.setText("მოთამაშე 1")
            }
            dawerili.setTextColor(Color.BLACK)
            dawerili.backgroundTintList = getColorStateList(R.color.orange)
            mogeba()
        }


    }

    private fun mogeba() {
        if ((x0.text == x1.text && x1.text == x2.text && x0.text == "O") || (x0.text == x4.text && x4.text == x8.text && x0.text == "O") || (x0.text == x3.text && x3.text == x6.text && x0.text == "O")
            || (x4.text == x1.text && x1.text == x7.text && x4.text == "O") || (x2.text == x5.text && x8.text == x2.text && x2.text == "O") || (x2.text == x4.text && x6.text == x2.text && x2.text == "O")
            || (x3.text == x4.text && x4.text == x5.text && x4.text == "O") || (x7.text == x6.text && x6.text == x8.text && x8.text == "O")
        ) {
            activoba = false
            mogebuli = 1
            Toast.makeText(this, "მოიგო პირველმა", Toast.LENGTH_SHORT).show()

        } else if ((x0.text == x1.text && x1.text == x2.text && x0.text == "X") || (x0.text == x4.text && x4.text == x8.text && x0.text == "X") || (x0.text == x3.text && x3.text == x6.text && x0.text == "X")
            || (x4.text == x1.text && x1.text == x7.text && x4.text == "X") || (x2.text == x5.text && x8.text == x2.text && x2.text == "X") || (x2.text == x4.text && x6.text == x2.text && x2.text == "X")
            || (x3.text == x4.text && x4.text == x5.text && x4.text == "X") || (x7.text == x6.text && x6.text == x8.text && x8.text == "X")
        ) {
            activoba = false
            mogebuli = 2
            Toast.makeText(this, "მოიგო მეორემ", Toast.LENGTH_SHORT).show()
        }
        var count = 0
        for (i in 0 until archeuli.size) {
            if (archeuli[i] == -1) {
                count++
            }
        }
        if (count == 0) {
            Toast.makeText(this, "ფრე", Toast.LENGTH_SHORT).show()
            return
        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun reset(view: View) {
        archeuli = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)
        activeplayer = player1
        activoba = true
        player.setText("მოთამაშე 1")
        x0.setText("")
        x1.setText("")
        x2.setText("")
        x3.setText("")
        x4.setText("")
        x5.setText("")
        x6.setText("")
        x7.setText("")
        x8.setText("")
        x0.backgroundTintList = getColorStateList(R.color.purple_500)
        x1.backgroundTintList = getColorStateList(R.color.purple_500)
        x2.backgroundTintList = getColorStateList(R.color.purple_500)
        x3.backgroundTintList = getColorStateList(R.color.purple_500)
        x4.backgroundTintList = getColorStateList(R.color.purple_500)
        x5.backgroundTintList = getColorStateList(R.color.purple_500)
        x6.backgroundTintList = getColorStateList(R.color.purple_500)
        x7.backgroundTintList = getColorStateList(R.color.purple_500)
        x8.backgroundTintList = getColorStateList(R.color.purple_500)

        if (mogebuli == 1) {
            angarishi1 += 1
            erti.text = angarishi1.toString()
            mogebuli = 0


        }
        if (mogebuli == 2) {
            angarishi2 += 1
            ori.text = angarishi2.toString()
            mogebuli = 0
        }


    }
}




