package com.example.adrianch.eva2_6_bundes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtNom,txtApe,txtEdad,txtSex,txtSal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtNom = (TextView) findViewById(R.id.txtNom);
        txtApe = (TextView) findViewById(R.id.txtApe);
        txtEdad = (TextView) findViewById(R.id.txtEdad);
        txtSal = (TextView) findViewById(R.id.txtSal);
        txtSex = (TextView) findViewById(R.id.txtSex);

        Intent recibirDatos = getIntent();
        Bundle bundleDatos = recibirDatos.getExtras();

        txtNom.setText(bundleDatos.getString("nombre"));
        txtApe.setText(bundleDatos.getString("apellido"));
        txtEdad.setText(""+bundleDatos.getInt("edad"));
        txtSal.setText("" + bundleDatos.getDouble("salario"));
        if (bundleDatos.getBoolean("sexo"))
            txtSex.setText("Hombre");
        else
            txtSex.setText("Mujer");

    }

    public void enClickCerrar(View view) {
        finish();
    }
}
