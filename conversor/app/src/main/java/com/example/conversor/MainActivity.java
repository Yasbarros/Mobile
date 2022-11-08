package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText c1, c2;
    private TextView de, para, resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.editValor);
        c2 = findViewById(R.id.editValorAtual);
        de = findViewById(R.id.de);
        para = findViewById(R.id.para);
        resultado = findViewById(R.id.textValor);

    }

    public void troca(View v){
        String deAtual = de.getText().toString();

        de.setText(para.getText());
        para.setText(deAtual);
    }

    public void converteValor(View v){
        double valor = Double.parseDouble(c1.getText(). toString());
        double cotacao = Double.parseDouble(c2.getText(). toString());
        if(de.getText().equals("Dolar")){
            double valorReal = valor * cotacao;
            String result = String.format("%.2f", valorReal);
            resultado.setText("Em R$: " +resultado);
        }else{
            double valorDolar = valor / cotacao;
            String result = String.format("%.2f", valorDolar);
            resultado.setText("Em U$: " +resultado);

        }

    }
}