package com.example.formulariomultiventana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText apPaterno;
    private EditText apMaterno;
    private EditText name;
    private EditText colonia;
    private EditText postal;
    private EditText calle;
    private EditText estado;
    private EditText municipio;
    private Button limpia;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apPaterno = (EditText) findViewById(R.id.APP);
        apMaterno = (EditText) findViewById(R.id.APM);
        name = (EditText) findViewById(R.id.NOM);
        colonia = (EditText) findViewById(R.id.C);
        postal = (EditText) findViewById(R.id.CP);
        calle = (EditText) findViewById(R.id.CLL);
        estado = (EditText) findViewById(R.id.ES);
        municipio = (EditText) findViewById(R.id.MU);
        limpia = (Button) findViewById(R.id.limpia);
    }

    public void Limpiar(View view) {
        apPaterno.setText("");
        apMaterno.setText("");
        name.setText("");
        colonia.setText("");
        postal.setText("");
        calle.setText("");
        estado.setText("");
        municipio.setText("");
    }

    public void enviar(View view){
        Intent i = new Intent(MainActivity.this,Informacion.class);
        i.putExtra("P",apPaterno.getText().toString());
        i.putExtra("M",apMaterno.getText().toString());
        i.putExtra("N",name.getText().toString());
        i.putExtra("Col",colonia.getText().toString());
        i.putExtra("Cod",postal.getText().toString());
        i.putExtra("Cal",calle.getText().toString());
        i.putExtra("Est",estado.getText().toString());
        i.putExtra("Mun",municipio.getText().toString());
        startActivity(i);
    }
}