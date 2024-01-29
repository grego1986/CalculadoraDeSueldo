package com.example.calculadoradesueldo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadoradesueldo.ui.theme.CalculadoraDeSueldoTheme

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
