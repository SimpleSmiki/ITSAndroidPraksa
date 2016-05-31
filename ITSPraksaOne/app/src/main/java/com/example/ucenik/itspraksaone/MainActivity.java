package com.example.ucenik.itspraksaone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView textOperation;
    Button btnCalaculate;
    EditText input1;
    EditText input2;
    TextView resultOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOperation = (TextView) findViewById(R.id.textOperation);
        input1 = (EditText) findViewById(R.id.inputOne);
        input2 = (EditText)findViewById(R.id.inputTwo);
        resultOutput = (TextView) findViewById(R.id.result);

    }

    public void calculate(View view) {
        double d1;
        double d2;
        try {
            d1 = Double.parseDouble(input1.getText().toString());
        } catch (NumberFormatException nfe) {
            d1 = 0;
        }
        try {
            d2 = Double.parseDouble(input2.getText().toString());
        } catch (NumberFormatException nfe) {
            d2 = 0;
            Toast.makeText(getApplicationContext(), "Invalid entry for second parameter", Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()) {
            case R.id.btnPlus: {
                textOperation.setText(getString(R.string.plus));
                resultOutput.setText(Double.toString(d1 + d2));
                break;
            }
            case R.id.btnMinus: {
                textOperation.setText(getString(R.string.minus));
                resultOutput.setText(Double.toString(d1 - d2));
                break;
            }
            case R.id.btnMulti: {
                textOperation.setText(getString(R.string.multiply));
                resultOutput.setText(String.valueOf(d1*d2));
            }
            case R.id.btnDivide: {
                textOperation.setText(getString(R.string.divide));
                if (d2 != 0) resultOutput.setText(String.valueOf(d1/d2));
                else Toast.makeText(getApplicationContext(), "Can not divide with zero", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
