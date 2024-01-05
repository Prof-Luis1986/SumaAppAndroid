package com.example.sumaappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Num1:EditText
    lateinit var Num2:EditText
    lateinit var btnSumar:Button
    lateinit var txtResultado:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Num1=findViewById(R.id.Num1)
        Num2=findViewById(R.id.Num2)
        btnSumar=findViewById(R.id.btnSumar)
        txtResultado=findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener(View.OnClickListener {
            val num1=Integer.parseInt(Num1.text.toString())
            val num2=Integer.parseInt(Num2.text.toString())

            txtResultado.setText("Resultado: "+sumar(num1,num2))
        })


    }
    fun sumar(Num1:Int,Num2:Int):Int{
        return Num1+Num2
    }
}