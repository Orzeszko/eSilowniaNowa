package com.orzeszko.esilownia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wtorek extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtorek);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);

    }


    public void zapisz(View view)
    {
        String Cwiczenie1 = editText1.getText().toString();
        String Cwiczenie2 = editText2.getText().toString();
        String Cwiczenie3 = editText3.getText().toString();
        String Cwiczenie4 = editText4.getText().toString();
        String Cwiczenie5 = editText5.getText().toString();
        String Cwiczenie6 = editText6.getText().toString();
        String Cwiczenie7 = editText7.getText().toString();


        String wtorekPlik1 = "wtorek1";
        String wtorekPlik2 = "wtorek2";
        String wtorekPlik3 = "wtorek3";
        String wtorekPlik4 = "wtorek4";
        String wtorekPlik5 = "wtorek5";
        String wtorekPlik6 = "wtorek6";
        String wtorekPlik7 = "wtorek7";


        try {
            FileOutputStream fileOutputStream1 = openFileOutput(wtorekPlik1, MODE_PRIVATE);
            fileOutputStream1.write(Cwiczenie1.getBytes());
            fileOutputStream1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream2 = openFileOutput(wtorekPlik2, MODE_PRIVATE);
            fileOutputStream2.write(Cwiczenie2.getBytes());
            fileOutputStream2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileOutputStream fileOutputStream3 = openFileOutput(wtorekPlik3, MODE_PRIVATE);
            fileOutputStream3.write(Cwiczenie3.getBytes());
            fileOutputStream3.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream4 = openFileOutput(wtorekPlik4, MODE_PRIVATE);
            fileOutputStream4.write(Cwiczenie4.getBytes());
            fileOutputStream4.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream5 = openFileOutput(wtorekPlik5, MODE_PRIVATE);
            fileOutputStream5.write(Cwiczenie5.getBytes());
            fileOutputStream5.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream6 = openFileOutput(wtorekPlik6, MODE_PRIVATE);
            fileOutputStream6.write(Cwiczenie6.getBytes());
            fileOutputStream6.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOutputStream7 = openFileOutput(wtorekPlik7, MODE_PRIVATE);
            fileOutputStream7.write(Cwiczenie7.getBytes());
            fileOutputStream7.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void wczytaj(View view)
    {
        try {
            String Message1;


            FileInputStream fileInputStream1 = openFileInput("wtorek1");
            InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream1);
            BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
            StringBuffer stringBuffer1 = new StringBuffer();
            while((Message1 = bufferedReader1.readLine()) != null)
            {
                stringBuffer1.append(Message1);
            }
            editText1.setText(stringBuffer1.toString());
            editText1.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String Message2;


            FileInputStream fileInputStream2 = openFileInput("wtorek2");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream2);
            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer2 = new StringBuffer();
            while((Message2 = bufferedReader2.readLine()) != null)
            {
                stringBuffer2.append(Message2);
            }
            editText2.setText(stringBuffer2.toString());
            editText2.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String Message3;


            FileInputStream fileInputStream3 = openFileInput("wtorek3");
            InputStreamReader inputStreamReader3 = new InputStreamReader(fileInputStream3);
            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader3);
            StringBuffer stringBuffer3 = new StringBuffer();
            while((Message3 = bufferedReader3.readLine()) != null)
            {
                stringBuffer3.append(Message3);
            }
            editText3.setText(stringBuffer3.toString());
            editText3.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            String Message4;


            FileInputStream fileInputStream4 = openFileInput("wtorek4");
            InputStreamReader inputStreamReader4 = new InputStreamReader(fileInputStream4);
            BufferedReader bufferedReader4 = new BufferedReader(inputStreamReader4);
            StringBuffer stringBuffer4 = new StringBuffer();
            while((Message4 = bufferedReader4.readLine()) != null)
            {
                stringBuffer4.append(Message4);
            }
            editText4.setText(stringBuffer4.toString());
            editText4.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String Message5;


            FileInputStream fileInputStream5 = openFileInput("wtorek5");
            InputStreamReader inputStreamReader5 = new InputStreamReader(fileInputStream5);
            BufferedReader bufferedReader5 = new BufferedReader(inputStreamReader5);
            StringBuffer stringBuffer5 = new StringBuffer();
            while((Message5 = bufferedReader5.readLine()) != null)
            {
                stringBuffer5.append(Message5);
            }
            editText5.setText(stringBuffer5.toString());
            editText5.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String Message6;


            FileInputStream fileInputStream6 = openFileInput("wtorek6");
            InputStreamReader inputStreamReader6 = new InputStreamReader(fileInputStream6);
            BufferedReader bufferedReader6 = new BufferedReader(inputStreamReader6);
            StringBuffer stringBuffer6 = new StringBuffer();
            while((Message6 = bufferedReader6.readLine()) != null)
            {
                stringBuffer6.append(Message6);
            }
            editText6.setText(stringBuffer6.toString());
            editText6.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String Message7;


            FileInputStream fileInputStream7 = openFileInput("wtorek7");
            InputStreamReader inputStreamReader7 = new InputStreamReader(fileInputStream7);
            BufferedReader bufferedReader7 = new BufferedReader(inputStreamReader7);
            StringBuffer stringBuffer7 = new StringBuffer();
            while((Message7 = bufferedReader7.readLine()) != null)
            {
                stringBuffer7.append(Message7);
            }
            editText7.setText(stringBuffer7.toString());
            editText7.setVisibility(View.VISIBLE);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
