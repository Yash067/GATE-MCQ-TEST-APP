package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class OS_Activity extends AppCompatActivity {
    ArrayList<String> Questions = new ArrayList<>();
    ArrayList<String> Answers = new ArrayList<>();
    ArrayList<String> OptionA = new ArrayList<>();
    ArrayList<String> OptionB = new ArrayList<>();
    ArrayList<String> OptionC = new ArrayList<>();
    ArrayList<String> OptionD = new ArrayList<>();
    static int score = 0;
    TextView textA;
    TextView textB;
    TextView textC;
    TextView textD;
    TextView question;
    Button a;
    Button b;
    Button c;
    Button d;
    private int index = 0;
    private int minutes = -1;
    private TextView timer;

    void initialize(){
        //1
        Questions.add("Which of the following page replacement algorithms suffers from Belady’s anomaly?");
        Answers.add("FIFO");
        OptionA.add("FIFO");
        OptionB.add("LRU");
        OptionC.add("Optimal Page Replacement");
        OptionD.add("Both LRU and FIFO");
        //2
        Questions.add("What is the swap space in the disk used for?");
        Answers.add("Saving process data");
        OptionA.add("Saving temporary html pages");
        OptionB.add("Saving process data");
        OptionC.add("Storing the super-block");
        OptionD.add("Storing device drivers");
        //3
        Questions.add("Increasing the RAM of a computer typically improves performance because:");
        Answers.add("Fewer page faults occur");
        OptionA.add("Virtual memory increases");
        OptionB.add("Larger RAMs are faster");
        OptionC.add("Fewer page faults occur");
        OptionD.add("Fewer segmentation faults occur");
        //4
        Questions.add("Virtual memory is");
        Answers.add("illusion of large main memory");
        OptionA.add("Large secondary memory");
        OptionB.add("Large main memory");
        OptionC.add("illusion of large main memory");
        OptionD.add("None of the above");
        //5
        Questions.add("Page fault occurs when");
        Answers.add("When a requested page is not in memory");
        OptionA.add("When a requested page is in memory");
        OptionB.add("When a requested page is not in memory");
        OptionC.add("When a page is corrupted");
        OptionD.add("When an exception is thrown");
        //6
        Questions.add("Thrashing occurs when");
        Answers.add("Processes on system frequently access pages not memory");
        OptionA.add("When a page fault occurs");
        OptionB.add("Processes on system frequently access pages not memory");
        OptionC.add("Processes on system are in running state");
        OptionD.add("Processes on system are in waiting state");
        //7
        Questions.add("The essential content(s) in each entry of a page table is / are");
        Answers.add("Page frame number");
        OptionA.add("Virtual page number");
        OptionB.add("Page frame number");
        OptionC.add("Both virtual page number and page frame number");
        OptionD.add("Access right information");
        //8
        Questions.add("Which of the following is not a form of memory?");
        Answers.add("instruction opcode");
        OptionA.add("instruction cache");
        OptionB.add("instruction register");
        OptionC.add("instruction opcode");
        OptionD.add("translation lookaside buffer");
        //9
        Questions.add("Dynamic linking can cause security concerns because:");
        Answers.add("The path for searching dynamic libraries is not known till runtime");
        OptionA.add("Security is dynamic");
        OptionB.add("The path for searching dynamic libraries is not known till runtime");
        OptionC.add("Linking is insecure");
        OptionD.add("Cryptographic procedures are not available for dynamic linking");
        //10
        Questions.add("Which one of the following is NOT shared by the threads of the same process?");
        Answers.add("Stack");
        OptionA.add("Stack");
        OptionB.add("Address Space");
        OptionC.add("File Descriptor Table");
        OptionD.add("Message Queue");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        question = findViewById(R.id.question);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        textA = findViewById(R.id.textA);
        textB = findViewById(R.id.textB);
        textC = findViewById(R.id.textC);
        textD = findViewById(R.id.textD);
        question.setText(Questions.get(0));
        a.setText("A");
        b.setText("B");
        c.setText("C");
        d.setText("D");
        textA.setText(OptionA.get(0));
        textB.setText(OptionB.get(0));
        textC.setText(OptionC.get(0));
        textD.setText(OptionD.get(0));

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.size() - 1) {    // If ArrayIndex in Bounds
                    if (Answers.get(index).equals(OptionA.get(index))) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.size() - 1) {    // Still in bounds
                        question.setText(Questions.get(index));
                        textA.setText(OptionA.get(index));
                        textB.setText(OptionB.get(index));
                        textC.setText(OptionC.get(index));
                        textD.setText(OptionD.get(index));
                    } else {
                        Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                    startActivity(intent);
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.size() - 1) {    // If ArrayIndex in Bounds
                    if (Answers.get(index).equals(OptionB.get(index))) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.size() - 1) {    // Still in bounds
                        question.setText(Questions.get(index));
                        textA.setText(OptionA.get(index));
                        textB.setText(OptionB.get(index));
                        textC.setText(OptionC.get(index));
                        textD.setText(OptionD.get(index));
                    } else {
                        Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                    startActivity(intent);
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.size() - 1) {    // If ArrayIndex in Bounds
                    if (Answers.get(index).equals(OptionC.get(index))) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.size() - 1) {    // Still in bounds
                        question.setText(Questions.get(index));
                        textA.setText(OptionA.get(index));
                        textB.setText(OptionB.get(index));
                        textC.setText(OptionC.get(index));
                        textD.setText(OptionD.get(index));
                    } else {
                        Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                    startActivity(intent);
                }
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.size() - 1) {    // If ArrayIndex in Bounds
                    if (Answers.get(index).equals(OptionC.get(index))) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.size() - 1) {    // Still in bounds
                        question.setText(Questions.get(index));
                        textA.setText(OptionA.get(index));
                        textB.setText(OptionB.get(index));
                        textC.setText(OptionC.get(index));
                        textD.setText(OptionD.get(index));
                    } else {
                        Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(OS_Activity.this, Result_OS.class);
                    startActivity(intent);
                }
            }
        });
//    CountDown timer
        timer = findViewById(R.id.timer);
        final long TOTAL_TIME = 60000;
        final long TICK_TIME = 1000;
        new CountDownTimer(TOTAL_TIME, TICK_TIME){ // for 20 minutes, tick after 1 minute
            @Override
            public void onTick(long millisUntilFinished) {
                //code to execute
                minutes++;
                timer.setText(minutes+ "");
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(OS_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}