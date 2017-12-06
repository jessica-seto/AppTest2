package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Lab4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button potentiometer = (Button) findViewById(R.id.lab4_potentiometer);
        potentiometer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent potentiometerintent = new Intent(getApplicationContext(), Potentiometer.class);
                startActivity(potentiometerintent);
            }

        });
        Button opamp = (Button) findViewById(R.id.lab4_OpAmp);
        opamp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent opampintent = new Intent(getApplicationContext(), OpAmpMain.class);
                startActivity(opampintent);
            }

        });
    }

}
