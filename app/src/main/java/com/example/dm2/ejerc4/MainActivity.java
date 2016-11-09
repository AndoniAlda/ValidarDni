package com.example.dm2.ejerc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumeroDni;
    EditText etLetraDni;
    Button btnValidar;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLetraDni = (EditText) findViewById(R.id.etLetraDni);
        etNumeroDni = (EditText) findViewById(R.id.etNumeroDni);
        btnValidar = (Button) findViewById(R.id.btnValidar);
        res = (TextView) findViewById(R.id.res);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dni = Integer.parseInt(String.valueOf(etNumeroDni.getText()));
                String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
                int modulo= dni % 23;
                char letra = juegoCaracteres.charAt(modulo);
                if (String.valueOf(etLetraDni.getText()).equals("")) {
                    etLetraDni.setText(letra+"");
                }else{
                    char letra2 =etLetraDni.getText().charAt(0);
                    if (letra == letra2){
                        res.setText("DNI VALIDO");
                    }else{
                        res.setText("DNI NO VALIDO, LA LETRA DEBERIA SER " + letra);
                    }

                }
            }
        });

    }
}
