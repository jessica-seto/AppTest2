package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);

        Button lab2_voltagedivider = (Button) findViewById(R.id.lab2_voltagedivider);
        lab2_voltagedivider.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent VoltageDivider = new Intent(getApplicationContext(), VoltageDivider.class);
                startActivity(VoltageDivider);
            }

        });

    }
}
