package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result_DL extends AppCompatActivity {
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_dl);
        resultText = findViewById(R.id.resultText);
        resultText.setText("Result :" + DL_Activity.score +"/ 10");
    }
}