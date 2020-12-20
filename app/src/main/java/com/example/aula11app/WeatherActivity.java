package com.example.aula11app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Intent i  = getIntent();
        String str = i.getStringExtra("temp") + " ";
        str += i.getStringExtra("umidade")+ " ";
        str += i.getStringExtra("dt");

        TextView txt = findViewById(R.id.txt);
        txt.setText(str);
    }
}
