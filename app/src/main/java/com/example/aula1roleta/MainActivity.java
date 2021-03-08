package com.example.aula1roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comparador(View view) {

        TextView texto = findViewById(R.id.textView2);

        EditText alc = findViewById(R.id.editTextNumberDecimal3);
        EditText gas = findViewById(R.id.editTextNumberDecimal4);


        Float n1 = Float.parseFloat(alc.getText().toString());
        Float n2 = Float.parseFloat(gas.getText().toString());

        if (n2 <= n1)
        {
            texto.setText("Mais em conta: Gasolina");
        }

        else
        {
            texto.setText("Mais em conta: Álcool");
        }
    }
}