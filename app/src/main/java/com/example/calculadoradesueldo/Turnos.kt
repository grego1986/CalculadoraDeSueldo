package com.example.calculadoradesueldo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Turnos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.turnos)

        val cmdVolver: Button = findViewById(R.id.cmdVolver)




        cmdVolver.setOnClickListener(){
            val intent = Intent(this@Turnos, MainActivity::class.java)
            //Iniciar menu
            startActivity(intent)
        }
    }
}