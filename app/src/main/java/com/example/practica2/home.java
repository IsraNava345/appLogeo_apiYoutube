package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {

    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout = (Button) findViewById(R.id.btn_signOut);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(home.this, MainActivity.class));
            }
        });

        Button calculadora = findViewById(R.id.btn_calculadora);
        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), calculadora.class);
                startActivityForResult(intent, 0);
            }
        });

        Button youtubeapi = findViewById(R.id.btn_youtubeapi);
        youtubeapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), youtubeapi.class);
                startActivityForResult(intent, 0);
            }
        });

        Button integrantes = findViewById(R.id.btn_integrantes);
        integrantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), integrantes.class);
                startActivityForResult(intent, 0);
            }
        });


    }


}