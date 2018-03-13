package com.example.palomera.primeratarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 //declaracion de variables

    EditText texto;
    TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto= (EditText)findViewById(R.id.editText);
        respuesta=(TextView)findViewById(R.id.textView2);

    }

public void  cambiar (View v)
    {
        String cadena= texto.getText().toString();
       String cadenai = "";

        for( int x =cadena.length()-1; x>=0; x--)
        {

            cadenai = cadenai + cadena.charAt(x);


        }

        texto.setText(cadenai.toUpperCase());



    }



}
