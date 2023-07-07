package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Choose_Activity extends AppCompatActivity {
    Button tests,previousPapers,notes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        tests = findViewById(R.id.tests);
        previousPapers = findViewById(R.id.previousPapers);
        notes = findViewById(R.id.notes);

        tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Choose_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        previousPapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Choose_Activity.this, "Coming soon!", Toast.LENGTH_SHORT).show();
            }
        });

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notesIntent = new Intent(Choose_Activity.this, Notes_Activity.class);
                startActivity(notesIntent);
            }
        });
    }

}