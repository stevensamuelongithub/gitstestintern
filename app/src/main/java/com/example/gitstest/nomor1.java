package com.example.gitstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nomor1 extends AppCompatActivity {
    EditText bilangan, hasil;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor1);

        bilangan = (EditText) findViewById(R.id.txtBilangan);
        hasil = (EditText) findViewById(R.id.txtHasil);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil = Integer.valueOf(bilangan.getText().toString());
                if (((bil % 3) == 0) && ((bil % 5) == 0)) {
                    hasil.setText("Hello World");
                } else if (((bil % 3) == 0)) {
                    hasil.setText("Hello");
                } else if (((bil % 5) == 0)) {
                    hasil.setText("World");
                } else {
                    hasil.setText("Masukan angka  yang habis dibagi 3/5 saja !");
                }


            }
        });


    }
}


