package com.example.ahzamghauriie.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText firstnum,secondnum;
    TextView result;
    Button add,sub,mul,div;
    double num1,num2,sum,subt,multi,divide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnum=(EditText)findViewById(R.id.firstnum);
        secondnum=(EditText)findViewById(R.id.secondnum);
        result=(TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(firstnum.getText().toString());
                num2=Double.parseDouble(secondnum.getText().toString());
                sum=num1+num2;
                result.setText(Double.toString(sum));

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(firstnum.getText().toString());
                num2=Double.parseDouble(secondnum.getText().toString());
                subt=num1-num2;
                result.setText(Double.toString(subt));

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(firstnum.getText().toString());
                num2=Double.parseDouble(secondnum.getText().toString());
                multi=num1*num2;
                result.setText(Double.toString(multi));

            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(firstnum.getText().toString());
                num2=Double.parseDouble(secondnum.getText().toString());
                divide=num1/num2;
                result.setText(Double.toString(divide));

            }
        });





    }
}
