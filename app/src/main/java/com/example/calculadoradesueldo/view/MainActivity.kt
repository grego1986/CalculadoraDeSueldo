package com.example.calculadoradesueldo.view

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.calculadoradesueldo.R

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        //referencia a los labels
        val lblBasico: TextView = findViewById(R.id.lblBasico)
        val lblTurnos: TextView = findViewById(R.id.lblTurnos)
        val lblRecibo: TextView = findViewById(R.id.lblRecibo)

        //Asignar el evento click a los label
        lblBasico.setOnClickListener(){
            //crear un Intent para ir a Basicos
            val intent = Intent(this@MainActivity, Basicos::class.java)
            startActivity(/* intent = */ intent)
        }

        lblTurnos.setOnClickListener(){

            val intent = Intent(this@MainActivity, Turnos::class.java)
            startActivity(intent)
        }

        lblRecibo.setOnClickListener(){
            val intent = Intent(this@MainActivity, Recibo::class.java)
            startActivity(intent)

        }

    }
}
