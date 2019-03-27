package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
TextView entry;
Button nine;
Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button add;
    Button minus;
    Button equals;
    char A='+';
    char B='-';
char EQU;

char action;
double a;
double b;
double ans;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result=(TextView)findViewById(R.id.answer);
        nine=(Button)findViewById(R.id.nine);
        eight=(Button) findViewById(R.id.eight);
        seven=(Button)findViewById(R.id.seven);
        six=(Button)findViewById(R.id.six);
        five=(Button)findViewById(R.id.five);
        four=(Button)findViewById(R.id.four);
        three=(Button)findViewById(R.id.three);
        two=(Button)findViewById(R.id.two);
        one=(Button)findViewById(R.id.one);
        add=(Button)findViewById(R.id.add);
        minus=(Button)findViewById(R.id.minus);
        entry=(TextView) findViewById(R.id.entry);
        equals=(Button)findViewById(R.id.equals);

        equals.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        compute();
        action=EQU;
        result.setText(result.getText().toString()+String.valueOf(ans));
    }
});
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'9');
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'8');
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'7');
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'6');
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'5');
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'4');
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'3');
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'2');
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'1');
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'+');
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                entry.setText(entry.getText().toString()+'-');

            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=EQU;
                result.setText(result.getText().toString());
            }
        });
        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
entry.setText(entry.getText().toString());
            }
        });
    }

    public void compute(){
        switch (action){
            case 'A':
        ans=a+b;
        break;
            case '-':
                ans=a-b;
                break;



        }
    }
}
