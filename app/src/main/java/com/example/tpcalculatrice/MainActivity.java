package com.example.tpcalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button _btnSom ;
    EditText _edtPremier ,_edtSecond ;
    TextView _txtResultat ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Liaison entre controle Xml et variable java et
        _btnSom= findViewById(R.id.btnSom) ;
        _edtPremier= findViewById(R.id.edtPremier);
        _edtSecond= findViewById(R.id.edtSecond);
        _txtResultat= findViewById(R.id.txtResultat);

        //traitement somme
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,somme;
                n1=Integer.parseInt(_edtPremier.getText().toString());
                n2=Integer.parseInt(_edtSecond.getText().toString());
                somme=n1+n2;
                _txtResultat.setText("Le résultat est:"+ String.valueOf(somme));
            }
        });

        //traitement différence
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,diff;
                n1=Integer.parseInt(_edtPremier.getText().toString());
                n2=Integer.parseInt(_edtSecond.getText().toString());
                diff=n1- n2;
                _txtResultat.setText("Le résultat est:"+ String.valueOf(diff));
            }
        });

        //traitement multiplication
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,diff;
                n1=Integer.parseInt(_edtPremier.getText().toString());
                n2=Integer.parseInt(_edtSecond.getText().toString());
                diff=n1 * n2;
                _txtResultat.setText("Le résultat est:"+ String.valueOf(diff));
            }
        });

        //traitement de division
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,diff;
                n1=Integer.parseInt(_edtPremier.getText().toString());
                n2=Integer.parseInt(_edtSecond.getText().toString());
                diff=n1 / n2;
                _txtResultat.setText("Le résultat est:"+ String.valueOf(diff));
            }
        });


    }
    }

