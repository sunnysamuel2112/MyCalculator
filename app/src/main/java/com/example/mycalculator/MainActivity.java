package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewBelow, textViewSymbol,textViewAbove,textViewResult,textViewEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBelow = (TextView) findViewById(R.id.textViewBelow);
        textViewSymbol = (TextView) findViewById(R.id.textViewSymbol);
        textViewAbove = (TextView) findViewById(R.id.textViewAbove);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        textViewEqual = (TextView) findViewById(R.id.textViewEqual);


    }

    //clear function
    public void clear(View view) {
        textViewBelow.setText("");
        textViewAbove.setText("");
        textViewSymbol.setText("");
        textViewResult.setText("");
        textViewEqual.setText("");

    }



    public void appendZero(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"0");
    }


    public void appendOne(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"1");
    }

    public void appendTwo(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"2");
    }

    public void appendThree(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"3");
    }

    public void appendFour(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"4");
    }

    public void appendFive(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"5");
    }

    public void appendSix(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"6");
    }

    public void appendSeven(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"7");
    }

    public void appendEight(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"8");
    }


    public void appendNine(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+"9");
    }


    public void appendDot(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewBelow.setText(txtAlready+".");
    }

    public void showDiv(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewSymbol.setText("÷");
        textViewBelow.setText("");
        textViewAbove.setText(txtAlready);

    }

    public void showMul(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewSymbol.setText("×");
        textViewBelow.setText("");
        textViewAbove.setText(txtAlready);

    }

    public void showSub(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewSymbol.setText("-");
        textViewBelow.setText("");
        textViewAbove.setText(txtAlready);

    }

    public void showAdd(View view) {
        String txtAlready = textViewBelow.getText().toString();
        textViewSymbol.setText("+");
        textViewBelow.setText("");
        textViewAbove.setText(txtAlready);

    }


    public void equate(View view) {
        Double num1 = Double.parseDouble(textViewAbove.getText().toString());
        Double num2 = Double.parseDouble(textViewBelow.getText().toString());
        String symbol = textViewSymbol.getText().toString();
        textViewEqual.setText("=");

        switch (symbol) {
            case "+": {
                Double res = num1 + num2;
                textViewResult.setText("" + res);
                break;
            }
            case "-": {
                Double res = num1 - num2;
                textViewResult.setText("" + res);
                break;
            }
            case "×": {
                Double res = num1 * num2;
                textViewResult.setText("" + res);
                break;
            }
            case "÷": {
                Double res = num1 / num2;
                textViewResult.setText("" + res);
                break;
            }
        }



    }
}