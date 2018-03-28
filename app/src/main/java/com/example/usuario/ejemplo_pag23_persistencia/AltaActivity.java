package com.example.usuario.ejemplo_pag23_persistencia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.usuario.ejemplo_pag23_persistencia.Modelo.DBLibros;

import moviles.android.ejemplo08.datos.DBLibros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AltaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);
    }

    public void grabar(View v) {
        String titulo = ((EditText) findViewById(R.id.txtTitulo)).getText().toString();
        String autor = ((EditText) findViewById(R.id.txtAutor)).getText().toString();
        Double precio = Double.parseDouble(((EditText) findViewById(R.id.txtPrecio)).getText().toString());
        DBLibros adp = new DBLibros(this);
        adp.altaLibro(titulo, autor, precio);
        adp.close();
        finish();
    }
}
