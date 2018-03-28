package com.example.usuario.ejemplo_pag23_persistencia;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.usuario.ejemplo_pag23_persistencia.Modelo.DBLibros;

public class ListadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        DBLibros adp = new DBLibros(this);
        Cursor c = adp.recuperarLibros();
        String[] columns = new String[]{“titulo”,”autor”,”precio”};
        int[] views = new int[]{R.id.titulo, R.id.autor, R.id.precio};
        SimpleCursorAdapter sc = new SimpleCursorAdapter(this, R.layout.listaLibros, c, columns, views, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        ListView lista = (ListView) findViewById(R.id.listaLibros);
        lista.setAdapter(sc);
        adp.close();
    }
}
}
