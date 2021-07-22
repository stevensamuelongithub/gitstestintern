package com.example.gitstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.validator.routines.EmailValidator;

public class nomor2 extends AppCompatActivity {
    EditText email, hasil;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor2);
        email = (EditText) findViewById(R.id.txtEmail);
        hasil = (EditText) findViewById(R.id.txtHasil);



        //String text = "myName@example.id";
        String text = "myName@example.co.id";
        String check1 = text.substring(text.length() - 2, text.length());
        String check2 = text.substring(text.length() - 5, text.length());


        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ee = email.getText().toString().trim();
                if(Patterns.EMAIL_ADDRESS.matcher(ee).matches()) {
                    if (ee.contains(check1) || ee.contains(check2)) {
                        hasil.setText("Format Email Valid");
                    } else {
                        hasil.setText("Format email tidak valid (bukan .id/.co.id )");
                    }
                }else{
                    hasil.setText("Format email tidak valid");
                    email.setError("Format email tidak benar!");
                    email.requestFocus();
                }


            }

        });

    }
}
