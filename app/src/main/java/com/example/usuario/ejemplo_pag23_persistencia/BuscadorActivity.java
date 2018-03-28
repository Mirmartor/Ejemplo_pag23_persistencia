package com.example.usuario.ejemplo_pag23_persistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.usuario.ejemplo_pag23_persistencia.Modelo.DBLibros;
import com.example.usuario.ejemplo_pag23_persistencia.Modelo.Libro;

public class BuscadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
    }

    public void buscar(View v) {
        String titulo = ((EditText) findViewById(R.id.textoTitulo)).getText().toString();
        DBLibros db = new DBLibros(this);
        Libro lib = db.recuperarLibroPorTitulo(titulo);
        String s ="";
        //si se encuentra el libro se muestran sus datos
        //si no, un mensaje de aviso
        if(lib!=null) {
            s += "Titulo: " + lib.getTitulo() + " Autor: " + lib.getAutor() + " Precio: " + lib.getPrecio();
        }else{
            s="Libro no encontrado";
        }
        ((TextView)findViewById(R.id.resultado)).setText(s);
        db.close();
    }
    public void salir(View v){
        finish(); }
    }
