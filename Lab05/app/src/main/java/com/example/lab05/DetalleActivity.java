package com.example.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Obtener los datos del intent
        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        String descripcion = intent.getStringExtra("descripcion");
        int imagen = intent.getIntExtra("imagen", 0);

        // Configurar los elementos de la CardView
        TextView detalleTitulo = findViewById(R.id.detalleTitulo);
        TextView detalleDescripcion = findViewById(R.id.detalleDescripcion);
        ImageView detalleImagen = findViewById(R.id.detalleImagen);

        detalleTitulo.setText(titulo);
        detalleDescripcion.setText(descripcion);
        detalleImagen.setImageResource(imagen);
    }
}
