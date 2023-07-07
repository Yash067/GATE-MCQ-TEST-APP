package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.gatemocktest.MainActivity;

public class SplashActivity extends AppCompatActivity {
    private TextView textView;
    // Delay of 2 sec before the next Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // For splash activity to cover the entire window

        setContentView(R.layout.activity_splash);
        //this will bind your MainActivity.class file with activity_main.

        int SPLASH_SCREEN_TIME_OUT = 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the MainActivity.

                finish();
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
