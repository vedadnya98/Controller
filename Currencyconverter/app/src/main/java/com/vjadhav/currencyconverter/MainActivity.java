package com.vjadhav.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    public void pound (View view){
        EditText enter = (EditText) findViewById(R.id.enter);
        Double noenter = Double.parseDouble(enter.getText().toString());
        Double topound = noenter*0.012;
        Toast.makeText(MainActivity.this, String.format("%.2f" , topound) , Toast.LENGTH_SHORT).show();
        TextView  answer = (TextView) findViewById(R.id.ans);
        answer.setText(String.format("%.2f" , topound));
    }
    public  void dollar (View view1){
        EditText enter = (EditText) findViewById(R.id.enter);
        Double noenter = Double.parseDouble(enter.getText().toString());
        Double todollar = noenter*0.015;
        Toast.makeText(MainActivity.this, String.format("%.2f" , todollar) , Toast.LENGTH_SHORT).show();
        TextView  answer = (TextView) findViewById(R.id.ans);
        answer.setText(String.format("%.2f" , todollar));
    }

    public void euro (View view2){
        EditText enter = (EditText) findViewById(R.id.enter);
        Double noenter = Double.parseDouble(enter.getText().toString());
        Double toeuro = noenter*0.014;
        Toast.makeText(MainActivity.this, String.format("%.2f" , toeuro) , Toast.LENGTH_SHORT).show();
        TextView  answer = (TextView) findViewById(R.id.ans);
        answer.setText(String.format("%.2f" , toeuro));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
