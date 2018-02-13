package com.example.orzeszko.esilownia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void wybierzPoniedzialek(View view) {
        Intent intent = new Intent(this, Dzien.class);
        startActivity(intent);
    }
}
