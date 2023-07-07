package com.example.gatemocktest;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gatemocktest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    ListView listView;
    String[] Subjects = {"  Engineering Mathematics",
                            "Digital Logic",
                            "Computer Organization and Architecture",
                            "Programming and Data-Structures",
                            "Algorithms",
                            "Theory of Computation",
                            "Compiler Design",
                            "Operating System",
                            "Databases",
                            "Computer Networks"};

    private BottomNavigationView bottomNavigationView;
    private Button inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.gatemocktest.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

                // Built-in adapter
        listView = findViewById(R.id.list_View);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Subjects);
        listView.setAdapter(adapter);

        inst = findViewById(R.id.inst);
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instIntent = new Intent(MainActivity.this, Inst_Activity.class);
                startActivity(instIntent);
            }
        });

            // Listener on ArrayAdapter listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                if(position == 0) {
                        i = new Intent(MainActivity.this, EM_Activity.class);
                        startActivity(i);
                        finish();
                    }
                else if(position == 1) {
                    i = new Intent(MainActivity.this, DL_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 2) {
                    i = new Intent(MainActivity.this, COA_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 3) {
                    i = new Intent(MainActivity.this, DS_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 4) {
                    i = new Intent(MainActivity.this, Algo_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 5) {
                    i = new Intent(MainActivity.this, TOC_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 6) {
                    i = new Intent(MainActivity.this, CD_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 7) {
                    i = new Intent(MainActivity.this, OS_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 8) {
                    i = new Intent(MainActivity.this, DBMS_Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(position == 9) {
                    i = new Intent(MainActivity.this, CN_Activity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}