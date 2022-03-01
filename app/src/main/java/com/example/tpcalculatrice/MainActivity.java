package com.example.tpcalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button _btnSom,_btnSou,_btnMul,_btnDiv,_btnMod ;
    EditText _edtPremier, _edtSecond ;
    TextView _txtResultat ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison
        _btnSom = findViewById(R.id.btnSom);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond =  findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat) ;
        _btnSou  = findViewById(R.id.btnSou);
        _btnMul = findViewById(R.id.btnMul);
        _btnDiv = findViewById(R.id.btnDiv);
        _btnMod = findViewById(R.id.btnMod);


        //traitements
        _btnSom.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view) {
                                           int n1 = Integer.parseInt(_edtPremier.getText().toString());
                                           int n2 = Integer.parseInt(_edtSecond.getText().toString());
                                           int somme = n1 + n2;

                                           _txtResultat.setText("Le résultat est: " + String.valueOf(somme));

                                       }
                                   }
        );
        _btnSou.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view) {
                                           int n1 = Integer.parseInt(_edtPremier.getText().toString());
                                           int n2 = Integer.parseInt(_edtSecond.getText().toString());
                                           int sou = n1 - n2;

                                           _txtResultat.setText("Le résultat est: " + String.valueOf(sou));

                                       }
                                   }
        );
        _btnMul.setOnClickListener(new View.OnClickListener()
                                             {
                                                 @Override
                                                 public void onClick(View view) {
                                                     int n1 = Integer.parseInt(_edtPremier.getText().toString());
                                                     int n2 = Integer.parseInt(_edtSecond.getText().toString());
                                                     int mul = n1 * n2;

                                                     _txtResultat.setText("Le résultat est: " + String.valueOf(mul));

                                                 }
                                             }
        );
        _btnDiv.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view) {
                                           int n1 = Integer.parseInt(_edtPremier.getText().toString());
                                           int n2 = Integer.parseInt(_edtSecond.getText().toString());
                                           int div = n1 / n2;

                                           _txtResultat.setText("Le résultat est: " + String.valueOf(div));

                                       }
                                   }
        );
        _btnMod.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view) {
                                           int n1 = Integer.parseInt(_edtPremier.getText().toString());
                                           int n2 = Integer.parseInt(_edtSecond.getText().toString());
                                           int mod = n1 % n2;

                                           _txtResultat.setText("Le résultat est: " + String.valueOf(mod));

                                       }
                                   }
        );

    }
}