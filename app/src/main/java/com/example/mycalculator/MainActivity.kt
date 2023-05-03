package com.example.mycalculator


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var tvnum1: EditText
    lateinit var tvnum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiple: Button
    lateinit var btnDiv: Button
    lateinit var tvAnswer: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnum1=findViewById(R.id.tvnum1)

        tvnum2= findViewById(R.id.tvnum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMultiple = findViewById(R.id.btnMultiple )
        btnDiv = findViewById(R.id.btnDiv)
        tvAnswer = findViewById(R.id.tvAnswer)
        Clicklistener()
    }

    fun Clicklistener() {
        btnAdd!!.setOnClickListener {
           val num1 = tvnum1!!.text.toString().toDouble()
            val num2 = tvnum2!!.text.toString().toDouble()
            val Answer = num1!! + num2!!
            tvAnswer!!.text = Answer.toString()
        }
        btnSub!!.setOnClickListener {
                var num1 = tvnum1!!.text.toString().toDouble()
                var num2 = tvnum2!!.text.toString().toDouble()
                val Answer = num1!! - num2!!
                tvAnswer!!.text = Answer.toString()
            }
        btnMultiple!!.setOnClickListener {
            var num1 = tvnum1!!.text.toString().toDouble()
            var num2 = tvnum2!!.text.toString().toDouble()
            val Answer = num1!! * num2!!
            tvAnswer!!.text = Answer.toString()
        }
        btnDiv!!.setOnClickListener {
            var num1 = tvnum1!!.text.toString().toDouble()
            var num2 = tvnum2!!.text.toString().toDouble()
            val Answer = num1!! / num2!!
            tvAnswer!!.text = Answer.toString()
        }
    }
}