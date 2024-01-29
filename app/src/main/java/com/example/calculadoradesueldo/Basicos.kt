package com.example.calculadoradesueldo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Basicos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Basicos", "onCreate called")
        setContentView(R.layout.basico)

        //Referencia a los Botones
        val cmdAgregar: Button = findViewById(R.id.btnAgregar)
        val cmdModificar: Button = findViewById(R.id.btnModificar)
        val cmdVolver: Button = findViewById(R.id.btnVolver)
        //Referencia a los EditText
        val txtBasico: EditText = findViewById(R.id.txtBasico)
        val txtManejoFondo: EditText = findViewById(R.id.txtManejoFondo)
        val txtAsistenciaPerfecta: EditText = findViewById(R.id.txtAsistenciaPerfecta)
        val txtNoRemunerativo: EditText = findViewById(R.id.txtNoRemunerativo)

        //Asignar el evento click a los Botones
        cmdAgregar.setOnClickListener(){

        }

        cmdModificar.setOnClickListener(){

        }

        cmdVolver.setOnClickListener(){
            //Volver al Menu
            val intent = Intent(this@Basicos, MainActivity::class.java)
            //Iniciar menu
            startActivity(intent)

        }


    }
}