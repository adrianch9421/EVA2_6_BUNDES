package com.example.adrianch.eva2_6_bundes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Principal extends AppCompatActivity {

    Button btnAccion;
    EditText editxtNom,editxtApe,editxtEdad,editxtSal;
    RadioGroup rGrp;
    RadioButton rbtnHom, rbtnMuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        editxtNom = (EditText) findViewById(R.id.editxtNom);
        editxtApe = (EditText) findViewById(R.id.editxtApe);
        editxtEdad = (EditText) findViewById(R.id.editxtEdad);
        editxtSal = (EditText) findViewById(R.id.editxtSal);
        rGrp = (RadioGroup) findViewById(R.id.rGrp);
        rbtnHom = (RadioButton) findViewById(R.id.rbtnHom);
    }

    public void enClick(View v) {
        Intent enviarDatos = new Intent(this, Secundaria.class);
        //Enviar los datos en un bundle
        Bundle bundleNuevo = new Bundle();
        bundleNuevo.putString("nombre", editxtNom.getText().toString());
        bundleNuevo.putString("apellido", editxtApe.getText().toString());
        bundleNuevo.putInt("edad", Integer.parseInt(editxtEdad.getText().toString()));
        bundleNuevo.putDouble("salario", Double.parseDouble(editxtSal.getText().toString()));
        bundleNuevo.putBoolean("sexo", rbtnHom.isChecked());
        enviarDatos.putExtras(bundleNuevo);
        startActivity(enviarDatos);
    }
}
