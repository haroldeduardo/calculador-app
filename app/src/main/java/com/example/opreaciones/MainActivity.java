package com.example.opreaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int num1;
    int num2;
    EditText campo1,campo2;
    TextView etiResultado;
    Button btnSumar,btnResta,btnMultiplicar,btnDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1 =(EditText) findViewById(R.id.campo1);
        campo2 = (EditText) findViewById(R.id.campo2);
        etiResultado =(TextView) findViewById(R.id.etiResultado);
    }


    public void onClick(View view) {

        num1 =Integer.parseInt(campo1.getText().toString());
        num2 =Integer.parseInt(campo2.getText().toString());
   switch (view.getId()){
       case R.id.btnSumar:sumar();
       break;

       case R.id.btnRestar:restar();
           break;

       case R.id.btnMultiplicar:multiplicar();
           break;

       case R.id.btnDivision:division();
           break;
   }
    }

    private void restar() {
        int  restar = num1-num2;
        etiResultado.setText("la resta es"+restar);
    }

    private void sumar() {
        int  sumar = num1+num2;
        etiResultado.setText("la suma es"+sumar);
    }

    private void multiplicar() {
        int  multiplicar = num1*num2;
        etiResultado.setText("la multiplicacion es"+multiplicar);
    }

    private void division() {


        if(num2>0){

            int  division = num1/num2;
            etiResultado.setText("la division es"+division);
        }

        else {
            etiResultado.setText("la division no se puede  hacer");
        }
    }
}