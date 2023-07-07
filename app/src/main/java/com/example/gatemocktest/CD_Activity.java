package com.example.gatemocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CD_Activity extends AppCompatActivity {
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
        Questions.add("In a compiler, keywords of a language are recognized during");
        Answers.add("the lexical analysis of the program");
        OptionA.add("parsing of the program");
        OptionB.add("the code generation");
        OptionC.add("the lexical analysis of the program");
        OptionD.add("dataflow analysis");
        //2
        Questions.add("Type checking is normally done during");
        Answers.add("Syntax directed translation");
        OptionA.add("Lexical analysis");
        OptionB.add("Syntax analysis");
        OptionC.add("Syntax directed translation");
        OptionD.add("Code optimization");
        //3
        Questions.add("One of the purposes of using intermediate code in compilers is to");
        Answers.add("increase the chances of reusing the machine-independent code optimizer in other compilers.");
        OptionA.add("make parsing and semantic analysis simpler.");
        OptionB.add("improve error recovery and error reporting.");
        OptionC.add("increase the chances of reusing the machine-independent code optimizer in other compilers.");
        OptionD.add("improve the register allocation.");
        //4
        Questions.add("In a two-pass assembler, symbol table is");
        Answers.add("Generated in first pass");
        OptionA.add("Generated in first pass");
        OptionB.add("Generated in second pass");
        OptionC.add("Not generated at all");
        OptionD.add("Generated and used only in second pass");
        //5
        Questions.add("Which phase of compiler generates stream of atoms?");
        Answers.add("Lexical Analysis");
        OptionA.add("Syntax Analysis");
        OptionB.add("Lexical Analysis");
        OptionC.add("Code Generation");
        OptionD.add("Code Optimization");
        //6
        Questions.add("Which one of the following is NOT performed during compilation?");
        Answers.add("Dynamic memory allocation");
        OptionA.add("Dynamic memory allocation");
        OptionB.add("Type checking");
        OptionC.add("Symbol table management");
        OptionD.add("Inline expansion");
        //7
        Questions.add("Symbol table can be used for:");
        Answers.add("All of these");
        OptionA.add("Checking type compatibility");
        OptionB.add("Suppressing duplication of error message");
        OptionC.add("Storage allocation");
        OptionD.add("All of these");
        //8
        Questions.add("Dead-code elimination in machine code optimization refers to :");
        Answers.add("Removal of values that never get used.");
        OptionA.add("Removal of all labels.");
        OptionB.add("Removal of values that never get used.");
        OptionC.add("Removal of function which are not involved.");
        OptionD.add("Removal of a module after its use.");
        //9
        Questions.add("The access time of the symbol table will be logarithmic if it is implemented by");
        Answers.add("Search tree");
        OptionA.add("Linear list");
        OptionB.add("Search tree");
        OptionC.add("Hash table");
        OptionD.add("Self organization list");
        //10
        Questions.add("The number of tokens in the following C statement is printf(\"i = %d, &i = %x\", i, &i);");
        Answers.add("10");
        OptionA.add("3");
        OptionB.add("26");
        OptionC.add("10");
        OptionD.add("21");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cd);

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
                        Intent intent = new Intent(CD_Activity.this, Result_CD.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CD_Activity.this, Result_CD.class);
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
                        Intent intent = new Intent(CD_Activity.this, Result_CD.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CD_Activity.this, Result_CD.class);
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
                        Intent intent = new Intent(CD_Activity.this, Result_CD.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CD_Activity.this, Result_CD.class);
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
                        Intent intent = new Intent(CD_Activity.this, Result_CD.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CD_Activity.this, Result_CD.class);
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
                Intent intent = new Intent(CD_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}