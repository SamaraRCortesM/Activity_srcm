package com.example.activity_srcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    TextView tvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        
        recibirdatos();
    }

    public void recibirdatos() {
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("Date");
        String d2 = extras.getString("Date2");

      tvDate = (TextView) findViewById(R.id.tvDate);
      tvDate.setText(d1+d2);

}
}