package com.example.gitstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nomor3 extends AppCompatActivity {
    EditText jam, hasil;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor3);
        jam = (EditText) findViewById(R.id.txtJam);
        hasil = (EditText) findViewById(R.id.txtHasil);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String now = jam.getText().toString();
               String now1, now2, now3;
               if(now.contains("AM")){
                   //now1 = now.substring(0,5);

                   now1= now.replaceAll(":.+","");
                   if(now1.length()<2){
                       now1="0"+now1;
                       now2 = "0"+now.replace(":", "");
                       now2 = now2.substring(2, 4);

                   }else {
                       now2 = now.replace(":", "");
                       now2 = now2.substring(2, 4);
                       now3 = now1;
                   }
                   now3 = now1;
                   if(now3.equals("12")){
                       now3="00";
                   }else{

                   }
                  // hasil.setText(now);
                  // hasil.setText(now2);
                   hasil.setText(now3+":"+now2);
                   int now33 = Integer.valueOf(now3);
                   int now22 = Integer.valueOf(now2);
                   if(now33>12){
                       hasil.setText("Masukan format jam yang benar !");
                   }
                   if(now22>60){
                       hasil.setText("Masukan format menit yang benar !");
                   }
               }else if(now.contains("PM")){

                   now1= now.replaceAll(":.+","");
                   if(now1.length()<2){
                       now1="0"+now1;
                       now2 = "0"+now.replace(":", "");
                       now2 = now2.substring(2, 4);

                   }else {
                       now2 = now.replace(":", "");
                       now2 = now2.substring(2, 4);
                       now3 = now1;
                   }
                   now3 = now1;
                   if(now3.equals("12")){
                       now3="00";
                   }else{

                   }
                   // hasil.setText(now);
                   // hasil.setText(now2);
                   int now33 = Integer.valueOf(now3);
                   int now22 = Integer.valueOf(now2);
                   now33 = now33+12;
                   hasil.setText(now33+":"+now2);
                   if(now33>24){
                       hasil.setText("Masukan format jam yang benar !");
                   }
                   if(now22>60){
                       hasil.setText("Masukan format menit yang benar !");
                   }
                }


            }
        });


    }
}