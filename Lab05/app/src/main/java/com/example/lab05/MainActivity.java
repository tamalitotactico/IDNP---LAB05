package com.example.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar los botones para abrir una nueva Activity
        LinearLayout btnItem1 = findViewById(R.id.btnItem1);
        LinearLayout btnItem2 = findViewById(R.id.btnItem2);

        btnItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir DetalleActivity con datos del botón 1
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("titulo", "Arequipa");
                intent.putExtra("descripcion", "Arequipa es un hermoso lugar al sur del peru");
                intent.putExtra("imagen", R.drawable.arequipa);
                startActivity(intent);
            }
        });

        btnItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir DetalleActivity con datos del botón 2
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("titulo", "Título 2");
                intent.putExtra("descripcion", "Descripción del ítem 2");
                intent.putExtra("imagen", R.drawable.yanahuara);
                startActivity(intent);
            }
        });
    }
}
