package com.example.myapplication.RojasE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asegúrate de que este sea el nombre correcto del layout

        // Encuentra el botón por su ID
        Button button = findViewById(R.id.button);

        // Establece un OnClickListener para el botón
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje Toast al presionar el botón
                Toast.makeText(MainActivity.this, "Has presionado el botón!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
