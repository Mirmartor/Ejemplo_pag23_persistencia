package com.example.usuario.ejemplo_pag23_persistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregar(View v) {
        Intent in = new Intent(this, AltaActivity.class);
        startActivity(in);
    }

    public void mostrar(View v) {
        Intent in = new Intent(this, ListadoActivity.class);
        startActivity(in);
    }

    public void buscar(View v) {
        Intent in = new Intent(this, BuscadorActivity.class);
        startActivity(in);
    }
}
