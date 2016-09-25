package com.syferlux.syferbankingtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void SendMessage(View view){
        Intent intent = new Intent(MainActivity.this, TunggalActivity.class);
        startActivity(intent);
    }
    public void SendMessage2(View view){
        Intent intent = new Intent(MainActivity.this, MajemukActivity.class);
        startActivity(intent);
    }

    public void SendMessage3(View view){
        Intent intent = new Intent(MainActivity.this, PrenumActivity.class);
        startActivity(intent);
    }
    public void SendMessage4(View view){
        Intent intent = new Intent(MainActivity.this, PostnumActivity.class);
        startActivity(intent);
    }
    public void SendMessage5(View view){
        Intent intent = new Intent(MainActivity.this, AnuitasActivity.class);
        startActivity(intent);
    }
    public void SendMessage6(View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    public void SendMessage7(View view){
        Intent intent = new Intent(MainActivity.this, AngsuranActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
