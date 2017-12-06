package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.text.TextUtils.isEmpty;
import static java.lang.Math.sqrt;

public class CriticallyDamped extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_critically_damped);
        Intent intent0 = getIntent();

    }

    private void makeCalculations(){
        double R;
        double L;
        double C;

        boolean isnotfilled1 = isEmpty(eqr_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(eqr_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1 != 0){
            eqr_tv_result.setText("Inductance Needed");
        }
        else if(nf2 != 0){
            eqr_tv_result.setText("Capacitance Needed");
        }
        else{
            L=Double.valueOf(eqr_input1.getText().toString());
            C=Double.valueOf(eqr_input2.getText().toString());
            if(n1==0||n2==0){
                eqr_tv_result.setText("Eq. Resistance = 0.0 Ohms");
            }
            else{
                R = sqrt((4*L)/C);
                eqr_tv_result.setText("Eq. Resistance = "+R+" Ohms");
            }
        }


    }

}
