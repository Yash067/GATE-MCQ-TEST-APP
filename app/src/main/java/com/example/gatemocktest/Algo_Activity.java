package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Algo_Activity extends AppCompatActivity {
    ArrayList<String> Questions = new ArrayList<>();
    ArrayList<String> Answers = new ArrayList<>();
    ArrayList<String> OptionA = new ArrayList<>();
    ArrayList<String> OptionB = new ArrayList<>();
    ArrayList<String> OptionC = new ArrayList<>();
    ArrayList<String> OptionD = new ArrayList<>();
    public static int score = 0;
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
        Questions.add("For 8 keys and 6 slots in a hashing table with uniform hashing and chaining," +
                      "what is the expected number of items that hash to a particular location. ");
        Answers.add("1.33");
        OptionA.add("0.75");
        OptionB.add("2.33");
        OptionC.add("1.33");
        OptionD.add("2");
        //2
        Questions.add("For n keys and m slots in a hashing table, which of the following is the expected number of empty location.");
        Answers.add("m((m-1)/m)^n ");
        OptionA.add("m^2((m-1)/m)^n ");
        OptionB.add("n((n-1)/m)^m ");
        OptionC.add("m((m-1)/m)^m ");
        OptionD.add("m((m-1)/m)^n ");
        //3
        Questions.add("What is the number of binary search trees with 20 nodes with elements 1, 2, 3,…." +
                "20 such that the root of tree is 12 and the root of left subtree is 7?");
        Answers.add("2642640");
        OptionA.add("32642450");
        OptionB.add("2642640");
        OptionC.add("342900");
        OptionD.add("5642640");
        //4
        Questions.add("What is the possible number of reflexive relations on a set 5 elSlgoents?");
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
        Questions.add("What will be the cost of the minimum spanning tree (MST) of such a graph with n nodes?");
        Answers.add(" n^2 – n + 1");
        OptionA.add(" n^2 – n - 1");
        OptionB.add(" n^2 – n + 1");
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
        Questions.add("The recurrence relation capturing the optimal time of the Tower of Hanoi problem with n discs is");
        Answers.add("T(n) = 2T(n – 1) + 1");
        OptionA.add("T(n) = 2Tn + 1");
        OptionB.add("T(n) = 2T(n – 1) + 1");
        OptionC.add("T(n) = T(n – 1) + 1");
        OptionD.add("T(n) = 2T(n – 1) +-1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo);

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
                        Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
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
                        Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
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
                        Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
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
                        Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(Algo_Activity.this, Result_Algo.class);
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
                Intent intent = new Intent(Algo_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}