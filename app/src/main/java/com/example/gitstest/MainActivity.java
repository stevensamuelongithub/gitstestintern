package com.example.gitstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button nomor1, nomor2, nomor3, nomor4, nomor5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomor1 = (Button) findViewById(R.id.button1);
        nomor2 = (Button) findViewById(R.id.button2);
        nomor3 = (Button) findViewById(R.id.button3);
        nomor4 = (Button) findViewById(R.id.button4);
        nomor5 = (Button) findViewById(R.id.button5);

        nomor1.setOnClickListener(this);
        nomor2.setOnClickListener(this);
        nomor3.setOnClickListener(this);
        nomor4.setOnClickListener(this);
        nomor5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this,"Soal Nomor 1", Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),nomor1.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2= new Intent(getApplicationContext(),nomor2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3= new Intent(getApplicationContext(),nomor3.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4= new Intent(getApplicationContext(),nomor4.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5= new Intent(getApplicationContext(),nomor5.class);
                startActivity(intent5);
                break;
        }
    }

}