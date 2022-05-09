package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonZero;
    TextView textViewBelow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        textViewBelow = (TextView) findViewById(R.id.textViewBelow);


    }

    public void appendZero(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"0");
    }

    public void clear(View view) {
        textViewBelow.setText("");
    }
}