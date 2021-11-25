package com.example.chaquetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setText("JACKETS INC. by MINTIC 2022");
                Toast.makeText(getApplicationContext(), "JACKETS INC", Toast.LENGTH_LONG).show();
            }
        });

        texto1 = (TextView) findViewById(R.id.texto1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Productos){
            Toast.makeText(getApplicationContext(), "Opcion Productos", Toast.LENGTH_LONG).show();
            Intent segundaPantalla = new Intent( this, MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if (id == R.id.Servicios){
            Toast.makeText(getApplicationContext(), "Opcion Servicios", Toast.LENGTH_LONG).show();
            Intent terceraPantalla = new Intent( this, MainActivity3.class);
            startActivity(terceraPantalla);
        }
        if (id == R.id.Sucursales){
            Toast.makeText(getApplicationContext(), "Opcion Sucursales", Toast.LENGTH_LONG).show();
            Intent cuartaPantalla = new Intent( this, MainActivity4.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}