package com.example.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public void sortearNumero(View view) {
        TextView texto = findViewById(R.id.textoSortear);

        texto.setText("5");
    }

}