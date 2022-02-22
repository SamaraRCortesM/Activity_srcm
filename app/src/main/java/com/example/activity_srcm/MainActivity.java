package com.example.activity_srcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvButton = (TextView) findViewById(R.id.tvButton);
        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this, SecondActivity2.class);
                i.putExtra("Date","Texto");
                i.putExtra("Date2","...");
                startActivity(i);
            }
        });
    }
}