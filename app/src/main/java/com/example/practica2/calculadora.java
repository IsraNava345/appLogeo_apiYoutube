package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class calculadora extends AppCompatActivity implements View.OnClickListener{
    // crear atributos para agregarlas en las clase
    EditText edt1, edt2;
    Button btnCalcular;
    TextView txtResultado;
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);


        Button back = findViewById(R.id.btn_backtres);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), home.class);
                startActivityForResult(intent, 0);
            }
        });

        //Encontrar las id de la vista principal
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
    }
    //Hacer la sumatoria usando los valores creados anteriormente
    public void onClick(View v){
        int valor1 = Integer.parseInt(edt1.getText().toString());
        int valor2 = Integer.parseInt(edt2.getText().toString());
        int r = valor1 + valor2;

        txtResultado.setText("="+r);
    }




}