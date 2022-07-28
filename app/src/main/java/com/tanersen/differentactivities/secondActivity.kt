package com.tanersen.differentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val getDataIntent=intent
        val getData=getDataIntent.getStringExtra("sendData")
        textView2.text=getData
        println(getData)
    }
    fun goBack(view: View){
        val getBackIntent=Intent(applicationContext,MainActivity::class.java)
        startActivity(getBackIntent)
    }
}