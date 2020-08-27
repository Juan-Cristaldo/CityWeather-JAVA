package com.example.cityweather_java;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ivtexAsuncion, ivtexCiudadEste, ivtexEncarnacion, ivtexLomaPlata, ivtexVillaRica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                                // El evento para el Texto Asunción
        ivtexAsuncion = (TextView) findViewById(R.id.tvAsuncion);
        ivtexAsuncion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Asuncion.class);
                startActivity(i);
            }
        });

                                // El evento para el Texto Ciudad del Este
        ivtexCiudadEste = (TextView) findViewById(R.id.tvCiudaddelEste);
        ivtexCiudadEste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CiudaddelEste.class);
                startActivity(i);
            }
        });

                                // El evento para el Texto Encarnación
        ivtexEncarnacion = (TextView) findViewById(R.id.tvEncarnacion);
        ivtexEncarnacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Encarnacion.class);
                startActivity(i);
            }
        });

                                // El evento para el Texto Loma Plata
        ivtexLomaPlata = (TextView) findViewById(R.id.tvLomaPlata);
        ivtexLomaPlata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LomaPlata.class);
                startActivity(i);
            }
        });

                                // El evento para el Texto Villa Rica
        ivtexVillaRica = (TextView) findViewById(R.id.tvVillaRica);
        ivtexVillaRica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, VillaRica.class);
                startActivity(i);
            }
        });
    }
}