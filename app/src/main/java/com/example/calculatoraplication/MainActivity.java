package com.example.calculatoraplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1;
    EditText editTextNum2;
    TextView textViewRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        textViewRes = findViewById(R.id.textViewRes);
    }

    public void somar(View view) {
        Double res = Double.parseDouble(editTextNum1.getText().toString()) + Double.parseDouble(editTextNum2.getText().toString().toString());
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());

    }

    public void sqrt(View view) {
        Double res = Math.sqrt(Double.parseDouble(editTextNum1.getText().toString()));
        textViewRes.setText(res.toString());

    }

    public void Subtrai(View view) {
        Double res = Double.parseDouble(editTextNum1.getText().toString()) - Double.parseDouble(editTextNum2.getText().toString().toString());
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void dividir(View view) {
        Double res = Double.parseDouble(editTextNum1.getText().toString()) / Double.parseDouble(editTextNum2.getText().toString().toString());
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void multiplicar(View view) {
        Double res = Double.parseDouble(editTextNum1.getText().toString()) * Double.parseDouble(editTextNum2.getText().toString().toString());
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void sqr(View view) {
        Double res = Math.pow(Double.parseDouble(editTextNum1.getText().toString()),Double.parseDouble(editTextNum2.getText().toString()));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void sen(View view) {
        Double res = Math.sin(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void cos(View view) {
        Double res = Math.cos(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void tan(View view) {
        Double res = Math.tan(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void porc(View view) {
        Double res = (((Double.parseDouble(editTextNum2.getText().toString())/100))*Double.parseDouble(editTextNum1.getText().toString())+(Double.parseDouble(editTextNum1.getText().toString())))-(Double.parseDouble(editTextNum1.getText().toString()));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }


    public void asen(View view) {
        Double res = Math.asin(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void acos(View view) {
        Double res = Math.acos(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void atan(View view) {
        Double res = Math.atan(Math.toRadians(Double.parseDouble(editTextNum1.getText().toString())));
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText(res.toString());
    }

    public void c(View view) {
        editTextNum1.setText("00");
        editTextNum2.setText("00");
        textViewRes.setText("00");
    }
}