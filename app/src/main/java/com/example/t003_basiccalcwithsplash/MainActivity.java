package com.example.t003_basiccalcwithsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1 , num2 ;
    Button add , sub , mul , div ;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1) ;
        num2 = findViewById(R.id.num2) ;
        res = findViewById(R.id.res) ;
        add = findViewById(R.id.add) ;
        sub = findViewById(R.id.sub) ;
        mul = findViewById(R.id.mul) ;
        div = findViewById(R.id.div) ;

        //String NUM1 = num1.getText().toString();
        //String NUM2 = num2.getText().toString();
        //Integer n1 = Integer.parseInt(NUM1);
        //Integer n2 = Integer.parseInt(NUM2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();
                Integer n1 = Integer.parseInt(NUM1);
                Integer n2 = Integer.parseInt(NUM2);
                Integer r1 = n1 + n2 ;
                Toast.makeText(getApplicationContext(),"Sum is = " + Integer.toString(r1), Toast.LENGTH_LONG).show();
                res.setText(Integer.toString(r1));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();
                Integer n1 = Integer.parseInt(NUM1);
                Integer n2 = Integer.parseInt(NUM2);
                Integer r1 = n1 - n2 ;
                Toast.makeText(getApplicationContext(),"Difference is = " + Integer.toString(r1), Toast.LENGTH_LONG).show();
                res.setText(Integer.toString(r1));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();
                Integer n1 = Integer.parseInt(NUM1);
                Integer n2 = Integer.parseInt(NUM2);
                Integer r1 = n1 * n2 ;
                Toast.makeText(getApplicationContext(),"Multiplication is = " + Integer.toString(r1), Toast.LENGTH_LONG).show();
                res.setText(Integer.toString(r1));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();
                Integer n1 = Integer.parseInt(NUM1);
                Integer n2 = Integer.parseInt(NUM2);
                Integer r1 = n1 / n2 ;
                Toast.makeText(getApplicationContext(),"Division is = " + Integer.toString(r1), Toast.LENGTH_LONG).show();
                res.setText(Integer.toString(r1));
            }
        });


    }
}