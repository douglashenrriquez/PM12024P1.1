package com.example.pm12024p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Configuracion.SQLliteConexion;
import Configuracion.Transaciones;

public class MainActivity extends AppCompatActivity {

    EditText TextNombre, TextApellido, TextTelefono;
    Button btn_procesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNombre = (EditText) findViewById(R.id.TextNombre);
        TextApellido = (EditText) findViewById(R.id.TextApellido);
        TextTelefono = (EditText) findViewById(R.id.TextTelefono);
        btn_procesar = (Button)  findViewById(R.id.btn_procesar);

        btn_procesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPersona();
            }
        });
    }

    private void addPersona() {
        SQLliteConexion conexion = new SQLliteConexion(this , Transaciones.DBName, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transaciones.nombre, TextNombre.getText().toString()
        );
    }
}