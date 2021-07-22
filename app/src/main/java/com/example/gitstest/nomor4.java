package com.example.gitstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nomor4 extends AppCompatActivity {
    EditText charr, hasil;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor4);
        charr = (EditText) findViewById(R.id.txtChar);
        hasil = (EditText) findViewById(R.id.txtHasil);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  String chars = charr.getText().toString().trim();
                StringBuffer c = new StringBuffer(charr.getText().toString());
                hasil.setText(c.reverse());

            }
        });
    }
}