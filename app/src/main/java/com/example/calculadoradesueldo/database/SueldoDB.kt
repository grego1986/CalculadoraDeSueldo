package com.example.calculadoradesueldo.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SueldoDB(context: Context) : SQLiteOpenHelper(context, sueldoDB, null, version)  {
    companion object {
        private const val sueldoDB = "bdsueldos.s3db"
        private const val version = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Lógica para crear tablas si no existen
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Lógica para actualizar la base de datos cuando sea necesario
    }


}