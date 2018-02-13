package com.example.orzeszko.esilownia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void wybierzMenu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
