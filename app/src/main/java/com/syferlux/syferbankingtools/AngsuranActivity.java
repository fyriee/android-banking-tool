package com.syferlux.syferbankingtools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SyferLux on 9/25/2016.
 */
public class AngsuranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angsuran_activity);

        Button buttonHasil = (Button)findViewById(R.id.hitungBtn);

        buttonHasil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                hitung();

            }
        });



    }

    public void hitung(){
        //declared variable
        double modalSaldo;
        double hasilSaldo;
        double bulanSaldo;
        double bungaSaldo;
        double anuitasSaldo;
        double aSide, bSide;
        String hasilStr;
        String modalStr, bungaStr, bulanStr, anuitasStr;

        //hitung method
        TextView modalTxt = (TextView)findViewById(R.id.modalTxt);
        TextView bungaTxt = (TextView)findViewById(R.id.bungaTxt);
        TextView bulanTxt = (TextView)findViewById(R.id.keTxt);
        TextView hasilTxt = (TextView)findViewById(R.id.hasilTxt);
        TextView anuitasTxt = (TextView)findViewById(R.id.anuitasTxt);

        hasilTxt.setKeyListener(null);

        modalStr = modalTxt.getText().toString();
        bungaStr = bungaTxt.getText().toString();
        bulanStr = bulanTxt.getText().toString();
        anuitasStr = anuitasTxt.getText().toString();


        if(modalStr == null | modalStr.isEmpty()){

            modalSaldo=0.0;

        }else{

            modalSaldo = Double.parseDouble(modalTxt.getText().toString());

        }
        if(bungaStr == null | bungaStr.isEmpty()){

            bungaSaldo=0.0;
        }else{

            bungaSaldo = Double.parseDouble(bungaTxt.getText().toString());
        }
        if(bulanStr == null | bulanStr.isEmpty()){

            bulanSaldo=0.0;

        }else{

            bulanSaldo = Double.parseDouble(bulanTxt.getText().toString());

        }
        if(anuitasStr == null | anuitasStr.isEmpty()){

            anuitasSaldo=0.0;

        }else{

            anuitasSaldo = Double.parseDouble(anuitasTxt.getText().toString());

        }




        //Hasil = Mo * (i + bunga)(i + bunga) / bunga

        aSide = (1+(bungaSaldo/100));
        bSide = Math.pow(aSide, bulanSaldo-1);

        hasilSaldo = (anuitasSaldo-(bungaSaldo/100*modalSaldo))*bSide;
        hasilStr = String.format("%.02f", hasilSaldo);
        hasilTxt.setText("Rp."+hasilStr);
    }
}

