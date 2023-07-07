package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gatemocktest.R;

import java.util.ArrayList;

public class COA_Activity extends AppCompatActivity {
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
        Questions.add("A fair dice is rolled twice. The probability that an odd number will follow an even number is");
        Answers.add("1/4");
        OptionA.add("1/2");
        OptionB.add("1/4");
        OptionC.add("1/6");
        OptionD.add("1/3");
        //2
        Questions.add("The rank of mxn matrix cannot be more than");
        Answers.add("m");
        OptionA.add("m^n");
        OptionB.add("mn");
        OptionC.add("m");
        OptionD.add("n");
        //3
        Questions.add("The curve given by the equation x^2 + y^2 = 3ax is");
        Answers.add("Symmetric about the line y = x");
        OptionA.add("Symmetric about the line y = 3x+2");
        OptionB.add("Symmetric about the line x = y+3a");
        OptionC.add("Symmetric about the line y = x");
        OptionD.add("Symmetric about the line y = 3x");
        //4
        Questions.add("What is the possible number of reflexive relations on a set 5 elements?");
        Answers.add("2^20");
        OptionA.add("2^20");
        OptionB.add("2^15");
        OptionC.add("2^10");
        OptionD.add("2^25");
        //5
        Questions.add("A non-planar graph with minimum number of vertices has");
        Answers.add("10 edges, 5 vertices");
        OptionA.add("10 edges, 5 vertices");
        OptionB.add("8 edges, 4 vertices");
        OptionC.add("9 edges, 5 vertices");
        OptionD.add("9 edges, 6 vertices");
        //6
        Questions.add("Maximum number of edges in a n - node undirected graph without self loops is");
        Answers.add("n(n-1)/2");
        OptionA.add("2n-1");
        OptionB.add("n(n+1)/2");
        OptionC.add("n^2");
        OptionD.add("n(n-1)/2");
        //7
        Questions.add("Which of the following statements is false?");
        Answers.add("Set of Rational numbers form and abelian group under multiplication");
        OptionA.add("Set of Rational numbers form and abelian group under addition");
        OptionB.add("Set of Rational numbers form and abelian group under multiplication");
        OptionC.add("Both A and B");
        OptionD.add("None of these");
        //8
        Questions.add("Which one of the following in NOT necessarily a property of Group?");
        Answers.add("Commutativity");
        OptionA.add("Associativity");
        OptionB.add("Existence of identity");
        OptionC.add("Commutativity");
        OptionD.add("Existence of inverse of every element");
        //9
        Questions.add("The number of functions from an m to n element set is");
        Answers.add("n^m");
        OptionA.add("m^n");
        OptionB.add("m+n");
        OptionC.add("n^m");
        OptionD.add("m*n");
        //10
        Questions.add("The number of equivalence relations on the set {1,2,3,4} is");
        Answers.add("4");
        OptionA.add("15");
        OptionB.add("14");
        OptionC.add("16");
        OptionD.add("4");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa);

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
                        Intent intent = new Intent(COA_Activity.this, Result_COA.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(COA_Activity.this, Result_COA.class);
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
                        Intent intent = new Intent(COA_Activity.this, Result_COA.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(COA_Activity.this, Result_COA.class);
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
                        Intent intent = new Intent(COA_Activity.this, Result_COA.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(COA_Activity.this, Result_COA.class);
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
                        Intent intent = new Intent(COA_Activity.this, Result_COA.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(COA_Activity.this, Result_COA.class);
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
                Intent intent = new Intent(COA_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}