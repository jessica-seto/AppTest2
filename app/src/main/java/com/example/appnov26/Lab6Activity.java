package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Lab6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button lab6_arduino= (Button) findViewById(R.id.lab6_arduino);
        lab6_arduino.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab6_arduinointent = new Intent(getApplicationContext(), Arduino.class);//change to non
                startActivity(lab6_arduinointent);
            }

        });
    }

}
