package com.example.examendeleonmairenadaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.IOException;

import static java.lang.Double.valueOf;

public class MainActivity extends AppCompatActivity {

    private TextView View;
    private TextView result;
    private EditText edit1;
    private EditText edit2;
    private Button button;
    calculos calc;
    private Double resultado;
    private String resultadoo;
    RadioGroup radio1;
    RadioButton radioButon;
    RadioButton radioButon2;
    private Double num1;
    private Double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = new calculos();
    }

    public void sumar(View view){
        try {
            edit1 = findViewById(R.id.numero1);
            num1 = Double.parseDouble(edit1.getText().toString());
            edit2 = findViewById(R.id.numero2);
            num2 = Double.parseDouble(edit2.getText().toString());
            result = findViewById(R.id.result);
        }catch(Exception e){
            result.setText("Error");
        }
        if(num1>0 || num2>0){
            resultado=calc.suma(num1,num2);
            try{
                resultadoo= String.valueOf(resultado);
                comprobarParidad(resultado);
                result.setText(resultadoo);
            }catch(Exception e){
                result.setText("Error");
            }
        }else{
            result.setText("Error");
        }



    }

    public void comprobarParidad(Double num){
        radioButon= findViewById(R.id.even);
        radioButon2= findViewById(R.id.odd);
        if(num%2==1){
            radioButon.setChecked(false);
            radioButon2.setChecked(true);
        }else{
            radioButon.setChecked(true);
            radioButon2.setChecked(false);
        }
    }

    public void restar(View view) {
        try {
            edit1 = findViewById(R.id.numero1);
            num1 = Double.parseDouble(edit1.getText().toString());
            edit2 = findViewById(R.id.numero2);
            num2 = Double.parseDouble(edit2.getText().toString());
            result = findViewById(R.id.result);
        }catch(Exception e){
            result.setText("Error");
        }
        if(num1>0 || num2>0){
            resultado=calc.resta(num1,num2);
            try{
                resultadoo= String.valueOf(resultado);
                comprobarParidad(resultado);
                result.setText(resultadoo);
            }catch(Exception e){
                result.setText("Error");
            }
        }else{
            result.setText("Error");
        }


    }

    public void multiplicar(View view) {
        try {
            edit1 = findViewById(R.id.numero1);
            num1 = Double.parseDouble(edit1.getText().toString());
            edit2 = findViewById(R.id.numero2);
            num2 = Double.parseDouble(edit2.getText().toString());
            result = findViewById(R.id.result);
        }catch(Exception e){
            result.setText("Error");
        }
        if(num1>0 || num2>0) {
            resultado = calc.multiplica(num1, num2);
            try{
                resultadoo= String.valueOf(resultado);
                comprobarParidad(resultado);
                result.setText(resultadoo);
            }catch(Exception e){
                result.setText("Error");
            }
        }else{
            result.setText("Error");
        }


    }

    public void dividir(View view) {
        try {
            edit1 = findViewById(R.id.numero1);
            Double num1;
            num1 = Double.parseDouble(edit1.getText().toString());
            edit2 = findViewById(R.id.numero2);
            Double num2;
            num2 = Double.parseDouble(edit2.getText().toString());
            result = findViewById(R.id.result);
        }catch(Exception e){
            result.setText("Error");
        }
        if(num1>0 && num2>0) {
            resultado = calc.divide(num1, num2);
            try{
                resultadoo= String.valueOf(resultado);
                comprobarParidad(resultado);
                result.setText(resultadoo);
            }catch(Exception e){
                result.setText("Error");
            }
        }else if(num2==0){
            result.setText("IllegalArgumentException");
        }else{
            result.setText("Error");
        }


    }
}
