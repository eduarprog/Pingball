package com.moodprogrammer.pingball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        final int DURACION = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Codigo que se ejecutara
                Intent intent = new Intent(inicio.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },DURACION);

    }
}