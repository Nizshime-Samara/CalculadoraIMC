package com.nizshime_samara.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inputPeso;
    private EditText inputAltura;
    private TextView imcResultado;
    private TextView imcConclusao;

    DecimalFormat currency = new DecimalFormat("00.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputPeso = findViewById(R.id.inputPeso);
        inputAltura = findViewById(R.id.inputAltura);
        imcResultado = findViewById(R.id.imcResultado);
        imcConclusao = findViewById(R.id.imcConclusao);
    }

    public void calcularImc(View view) {
        double pesoPessoa = Double.parseDouble(inputPeso.getText().toString()); /*transforma a variavel de tipo numero double em string*/
        double alturaPessoa = Double.parseDouble(inputAltura.getText().toString());

        double resultadoImc = pesoPessoa / (alturaPessoa * alturaPessoa);/*formula do calculo IMC*/

        if (resultadoImc <= 16 && resultadoImc <= 16.99) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso de magreza extrema : " + currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.emergência));
            imcResultado.setText("" +  currency.format(resultadoImc));
        } else if (resultadoImc >= 17 && resultadoImc <= 18.5) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso de magreza moderada : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.urgente));
            imcResultado.setText("" +  currency.format(resultadoImc));
        } else if (resultadoImc >= 18.5 && resultadoImc <= 25) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso IMC saudável : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.nao_urgente));
            imcResultado.setText("" +  currency.format(resultadoImc));
        } else if (resultadoImc >= 25 && resultadoImc <= 30) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso de sobrepeso : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.pouco_urgente));
            imcResultado.setText("=" +  currency.format(resultadoImc));
        } else if (resultadoImc >= 30 && resultadoImc <= 35) {
            imcConclusao.setText("  Portanto, seu IMC apresenta caso IMC  obesidade Grau 1 : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.urgente));
            imcResultado.setText("" +  currency.format(resultadoImc));
        } else if (resultadoImc >= 35 && resultadoImc <= 40) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso IMC  obesidade Grau 2 (severa) : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.muito_urgente));
            imcResultado.setText("" +  currency.format(resultadoImc));
        } else if (resultadoImc > 40) {
            imcConclusao.setText("Portanto, seu IMC apresenta caso IMC obesidade grau 3 (mórbida) : " +  currency.format(resultadoImc));
            imcConclusao.setBackgroundColor(getResources().getColor(R.color.emergência));
            imcResultado.setText("" +  currency.format(resultadoImc)
            );
        }
    }}



