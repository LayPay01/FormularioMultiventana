package com.example.formulariomultiventana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    private TextView APP;
    private TextView APM;
    private TextView NOM;
    private TextView C;
    private TextView CP;
    private TextView CLL;
    private TextView ES;
    private TextView MU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        APP = findViewById(R.id.APP);
        APM = findViewById(R.id.APM);
        NOM = findViewById(R.id.NOM);
        C = findViewById(R.id.C);
        CP = findViewById(R.id.CP);
        CLL = findViewById(R.id.CLL);
        ES = findViewById(R.id.ES);
        MU = findViewById(R.id.MU);

        String P = getIntent().getStringExtra("P");
        String M = getIntent().getStringExtra("M");
        String N = getIntent().getStringExtra("N");
        String Col = getIntent().getStringExtra("Col");
        String Cod = getIntent().getStringExtra("Cod");
        String Cal = getIntent().getStringExtra("Cal");
        String Est = getIntent().getStringExtra("Est");
        String Mun = getIntent().getStringExtra("Mun");

        APP.setText(""+P);
        APM.setText(""+M);
        NOM.setText(""+N);
        C.setText(""+Col);
        CP.setText(""+Cod);
        CLL.setText(""+Cal);
        ES.setText(""+Est);
        MU.setText(""+Mun);
    }
    //Método para el botón Regresar

    public void regresar(View view){
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}