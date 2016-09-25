package com.syferlux.syferbankingtools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SyferLux on 9/25/2016.
 */
public class AnuitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anuitas_activity);

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
        double aSide, bSide;
        String hasilStr;
        String modalStr, bungaStr, bulanStr;

        //hitung method
        TextView modalTxt = (TextView)findViewById(R.id.modalTxt);
        TextView bungaTxt = (TextView)findViewById(R.id.bungaTxt);
        TextView bulanTxt = (TextView)findViewById(R.id.keTxt);
        TextView hasilTxt = (TextView)findViewById(R.id.hasilTxt);

        hasilTxt.setKeyListener(null);

        modalStr = modalTxt.getText().toString();
        bungaStr = bungaTxt.getText().toString();
        bulanStr = bulanTxt.getText().toString();


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

            bulanSaldo=0;

        }else{

            bulanSaldo = Double.parseDouble(bulanTxt.getText().toString());

        }




        //Hasil = Mo * (i + bunga)(i + bunga) / bunga

        aSide = (1+(bungaSaldo/100));
        bSide = Math.pow(aSide, bulanSaldo);

        hasilSaldo = (modalSaldo *  bSide * bungaSaldo / 100)/(bSide-1);
        hasilStr = String.format("%.02f", hasilSaldo);
        hasilTxt.setText("Rp."+hasilStr);
    }
}

