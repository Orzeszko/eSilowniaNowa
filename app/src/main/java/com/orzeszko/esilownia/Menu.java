package com.orzeszko.esilownia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.orzeszko.esilownia.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);



    }

    public void wybierzPoniedzialek(View view) {

        Intent intent = new Intent(this, Poniedzialek.class);
        startActivity(intent);
    }
    public void wybierzWtorek(View view) {

        Intent intent = new Intent(this, Wtorek.class);
        startActivity(intent);
    }

    public void wybierzSroda(View view) {

        Intent intent = new Intent(this, Sroda.class);
        startActivity(intent);
    }
    public void wybierzCzwartek(View view) {

        Intent intent = new Intent(this, Czwartek.class);
        startActivity(intent);
    }
    public void wybierzPiatek(View view) {

        Intent intent = new Intent(this, Piatek.class);
        startActivity(intent);
    }

    public void wybierzSobota(View view) {

        Intent intent = new Intent(this, Sobota.class);
        startActivity(intent);
    }
    public void wybierzNiedziela(View view) {

        Intent intent = new Intent(this, Niedziela.class);
        startActivity(intent);
    }
}
