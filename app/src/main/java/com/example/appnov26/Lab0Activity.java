package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Lab0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab0);
        Intent intent0 = getIntent();

        Button lab0_multimeter = (Button) findViewById(R.id.lab0_multimeter);
        lab0_multimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab0_multimeter = new Intent(getApplicationContext(), Multimeter.class);
                startActivity(lab0_multimeter);
            }
        });
    }
}
