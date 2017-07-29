package com.example.ssaud.calculatorsaud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ress;
    EditText num1,num2;
    String a;
    String b;
    int m=0;
    int n=0;
    int c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ress=(TextView)findViewById(R.id.result);
        num1=(EditText)findViewById(R.id.txtNum1);
        num2=(EditText)findViewById(R.id.txtNum2);
        a = num1.getText().toString();
        b= num2.getText().toString();

    }

    public void add(View view) {

        try {
            m = Integer.parseInt(a);
            n = Integer.parseInt(b);
            ress.setText("");
            c=m+n;
            ress.setText(c);
        }
        catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }
    }

    public void sub(View view) {
    }

    public void mul(View view) {
    }

    public void div(View view) {
    }
}
