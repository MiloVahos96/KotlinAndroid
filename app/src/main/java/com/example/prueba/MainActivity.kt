package com.example.prueba

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BCalcular.setOnClickListener {
            val nacimiento : Int = editText.text.toString().toInt()
            val actual = Calendar.getInstance().get(Calendar.YEAR)
            val miEdad = actual - nacimiento
            textView.text = "Tu edad es $miEdad"
        }

        BSiguiente.setOnClickListener(){
            startActivity(this,SecondActivity::class.java)
        }

    }

    fun startActivity( activity: Activity, nextActivity: Class<*> ) {
        val intent = Intent(activity,nextActivity)
        intent.putExtra("saludo", "Hola, desde la clase Main")
        activity.startActivity(intent)
        activity.finish()
    }
}
