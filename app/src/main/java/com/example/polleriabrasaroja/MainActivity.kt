package com.example.polleriabrasaroja

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //calendarView = findViewById(R.id.calendar_view)
        //calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Mostrar un mensaje cuando se selecciona una fecha
        //    val date = "$dayOfMonth/${month + 1}/$year"
        //    Toast.makeText(this, "Fecha seleccionada: $date", Toast.LENGTH_SHORT).show()
        //}

    }

    fun Registrar(view: View?) {
        val registrar = Intent(this, Registro::class.java)
        startActivity(registrar)
    }

    fun Ingresar(view: View?) {
        val ingresar = Intent(this, Menu::class.java)
        startActivity(ingresar)
    }

}