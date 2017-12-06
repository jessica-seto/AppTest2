package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        Button opamp = (Button) findViewById(R.id.opampbutton);
        opamp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent opamp = new Intent(getApplicationContext(), OpAmpDiagram.class);
                startActivity(opamp);
            }

        });
    }
}
