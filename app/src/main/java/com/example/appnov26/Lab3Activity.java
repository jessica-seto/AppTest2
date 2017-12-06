package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Lab3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button lab3_thevenin = (Button) findViewById(R.id.lab3_thevenin);
        lab3_thevenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab3_thevenin = new Intent(getApplicationContext(), TheveninDiagram.class);
                startActivity(lab3_thevenin);
            }
        });
    }

}
