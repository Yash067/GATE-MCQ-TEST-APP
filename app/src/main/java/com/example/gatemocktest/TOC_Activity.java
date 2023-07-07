package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TOC_Activity extends AppCompatActivity {
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
        Questions.add("The smallest finite automation which accepts the language {x | length of x is divisible by 3} has :");
        Answers.add("3 states");
        OptionA.add("2 states");
        OptionB.add("3 state");
        OptionC.add("4 states");
        OptionD.add("5 states");
        //2
        Questions.add("How many minimum states are required in a DFA to find whether a given binary string has odd number of 0's or not, there can be any number of 1's.");
        Answers.add("2");
        OptionA.add("1");
        OptionB.add("2");
        OptionC.add("3");
        OptionD.add("4");
        //3
        Questions.add("What can be said about a regular language L over {a} whose minimal finite state automaton has two states?");
        Answers.add("Either L must be {a^n | n is odd}, or L must be {a^n | n is even}");
        OptionA.add("L must be {a^n| n is odd}");
        OptionB.add("L must be {a^n| n is even}");
        OptionC.add("L must be {a^n| ³ O}");
        OptionD.add("Either L must be {a^n | n is odd}, or L must be {a^n | n is even}");
        //4
        Questions.add("Let L denotes the language generated by the grammar S -> 0S0/00. Which of the following is true?");
        Answers.add("L is regular but not 0+");
        OptionA.add("L = 0+");
        OptionB.add("L is regular but not 0+");
        OptionC.add("L is context free but not regular");
        OptionD.add("L is not context free");
        //5
        Questions.add("Let S and T be language over ? = {a,b} represented by the regular expressions (a+b*)* and (a+b)*, respectively. Which of the following is true?");
        Answers.add("S = T");
        OptionA.add("S ? T");
        OptionB.add("T ? S");
        OptionC.add("S = T");
        OptionD.add("S ? T = ?");
        //6
        Questions.add("Consider a DFA over ? = {a, b} accepting all strings which have number of a’s divisible by 6 and number of b’s divisible by 8. What is the minimum number of states that the DFA will have?");
        Answers.add("48");
        OptionA.add("8");
        OptionB.add("14");
        OptionC.add("15");
        OptionD.add("48");
        //7
        Questions.add("Given an arbitary non-deterministic finite automaton (NFA) with N states, the maximum number of states in an equivalent minimized DFA is at least");
        Answers.add("2^N");
        OptionA.add("N^2");
        OptionB.add("2^N");
        OptionC.add("2N");
        OptionD.add("N!");
        //8
        Questions.add("The regular expression 0*(10*)* denotes the same set as");
        Answers.add("none of these");
        OptionA.add("(1*0)*1*");
        OptionB.add("0 + (0 + 10)*");
        OptionC.add("(0 + 1)* 10(0 + 1)*");
        OptionD.add("none of these");
        //9
        Questions.add("Which one of the following languages over the alphabet {0,1} is described by the regular expression: (0+1)*0(0+1)*0(0+1)*?");
        Answers.add("The set of all strings containing at least two 0’s");
        OptionA.add("The set of all strings containing the substring 00");
        OptionB.add("The set of all strings containing at most two 0’s");
        OptionC.add("The set of all strings containing at least two 0’s");
        OptionD.add("The set of all strings that begin and end with either 0 or 1");
        //10
        Questions.add("Which of the  following is TRUE?");
        Answers.add("Every finite subset of a non-regular set is regular");
        OptionA.add("Every subset of a regular set is regular");
        OptionB.add("Every finite subset of a non-regular set is regular");
        OptionC.add("The union of two non-regular sets is not regular");
        OptionD.add("Infinite union of finite sets is regular");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc);

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
                        Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
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
                        Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
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
                        Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
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
                        Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
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
                Intent intent = new Intent(TOC_Activity.this, Result_TOC.class);
                startActivity(intent);
            }
        }.start();
    }
}