package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etIngreso;
    private TextView tvTexto;
    private Button btnOperar;
    private Calculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        calculadora = new Calculadora();


        setupClickListener();
    }

    private void setupClickListener() {

        btnOperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sumarValores();

            }
        });
    }

    private void sumarValores() {
        String temp = String.valueOf(calculadora.add(etIngreso.getText().toString()));
        tvTexto.setText(temp);
    }

    private void initWidgets() {
        etIngreso = findViewById(R.id.etNumeros);
        tvTexto = findViewById(R.id.tvIngreso);
        btnOperar = findViewById(R.id.btnOperar);
    }


}