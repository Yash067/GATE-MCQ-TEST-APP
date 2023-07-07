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

public class DBMS_Activity extends AppCompatActivity {
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
        Questions.add("The statement that is executed automatically by the system as a side effect of the modification of the database is");
        Answers.add("trigger");
        OptionA.add("backup");
        OptionB.add("assertion");
        OptionC.add("recovery");
        OptionD.add("trigger");
        //2
        Questions.add("Which of the following command is used to delete a table in SQL?");
        Answers.add("drop");
        OptionA.add("delete");
        OptionB.add("truncate");
        OptionC.add("remove");
        OptionD.add("drop");
        //3
        Questions.add("A Relation R with FD set {A->BC, B->A, A->C, A->D, D->A}. How many candidate keys will be there in R?");
        Answers.add("3");
        OptionA.add("1");
        OptionB.add("2");
        OptionC.add("3");
        OptionD.add("4");
        //4
        Questions.add("Consider the FDs given in above question. The relation R is");
        Answers.add("in 1NF, but not in 2NF");
        OptionA.add("in 1NF, but not in 2NF");
        OptionB.add("in 2NF, but not in 3NF");
        OptionC.add("in 3NF, but not in BCNF");
        OptionD.add("in BCNF");
        //5
        Questions.add("The maximum number of superkeys for the relation schema R(E,F,G,H) with E as the key is");
        Answers.add("8");
        OptionA.add("5");
        OptionB.add("6");
        OptionC.add("7");
        OptionD.add("8");
        //6
        Questions.add("Which one of the following statements about normal forms is FALSE?");
        Answers.add("Lossless,dependency-preserving decomposi­tion into BCNF is always possible");
        OptionA.add("BCNF is stricter than 3NF");
        OptionB.add("Lossless, dependency-preserving decomposi­tion into 3NF is always possible");
        OptionC.add("Lossless, dependency-preserving decomposi­tion into BCNF is always possible");
        OptionD.add("Any relation with two attributes is in BCNF");
        //7
        Questions.add("With regard to the expressive power of the formal relational query languages, which of the following statements is true?");
        Answers.add("Relational algebra has the same power as safe relational calculus");
        OptionA.add("Relational algebra is more powerful than relational calculus");
        OptionB.add("Relational algebra has the same power as relational calculus");
        OptionC.add("Relational algebra has the same power as safe relational calculus");
        OptionD.add("None of the above");
        //8
        Questions.add("R(A,B,C,D) is a relation. Which of the following does not have a lossless join, dependency preserving BCNF decomposition?");
        Answers.add("AB->C, C->AD");
        OptionA.add("A->B, B->CD");
        OptionB.add("A->B, B->C, C->D");
        OptionC.add("AB->C, C->AD");
        OptionD.add("A->BCD");
        //9
        Questions.add("Which of the following is NOT a superkey in a relational schema with attributes V, W, X, Y, Z and primary key V Y ?");
        Answers.add("V W X Z");
        OptionA.add("V X Y Z");
        OptionB.add("V W X Z");
        OptionC.add("V W X Y");
        OptionD.add("V W X Y Z");
        //10
        Questions.add("Which level of locking provides the highest degree of concurrency in a relational data base?");
        Answers.add("Row");
        OptionA.add("Page");
        OptionB.add("Table");
        OptionC.add("Row");
        OptionD.add("Page, table and row level locking allow the same degree of concurrency");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);

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
                        Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
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
                        Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
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
                        Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
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
                        Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DBMS_Activity.this, Result_DBMS.class);
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
                Intent intent = new Intent(DBMS_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}