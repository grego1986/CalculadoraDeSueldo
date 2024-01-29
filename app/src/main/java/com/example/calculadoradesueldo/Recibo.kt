package com.example.calculadoradesueldo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recibo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recibo)

        val cmdVolver: Button = findViewById(R.id.cmdVolver)


        cmdVolver.setOnClickListener(){
            val intent = Intent(this@Recibo, MainActivity::class.java)
            //Iniciar menu
            startActivity(intent)
        }

    }
}