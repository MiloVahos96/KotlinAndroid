package com.example.prueba

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val TIntent = findViewById(R.id.TIntent) as TextView

        val bundle = intent.extras
        if ( bundle != null && bundle.getString("saludo") != null ) {
            TIntent.text = bundle.getString("saludo")
        }


    }
}
