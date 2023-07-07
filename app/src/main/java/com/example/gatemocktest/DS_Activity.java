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

public class DS_Activity extends AppCompatActivity {
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
        Questions.add("A program P reads in 500 integers in the range [0..100] exepresenting the scores of 500 students. It then prints the frequency of each score above 50. What would be the best way for P to store the frequencies?");
        Answers.add("An array of 50 numbers");
        OptionA.add("An array of 50 numbers");
        OptionB.add("An array of 100 numbers");
        OptionC.add("An array of 500 numbers");
        OptionD.add("A dynamically allocated array of 550 numbers");
        //2
        Questions.add("Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?");
        Answers.add("Merge Sort");
        OptionA.add("Insertion Sort");
        OptionB.add("Quick Sort");
        OptionC.add("Heap Sort");
        OptionD.add("Merge Sort");
        //3
        Questions.add("How many stacks are needed to implement a queue. Consider the situation where no other data structure like arrays, linked list is available to you.");
        Answers.add("1");
        OptionA.add("2");
        OptionB.add("3");
        OptionC.add("4");
        OptionD.add("2");
        //4
        Questions.add("The result evaluating the postfix expression 10 5 + 60 6 / * 8 - is");
        Answers.add("142");
        OptionA.add("284");
        OptionB.add("213");
        OptionC.add("142");
        OptionD.add("71");
        //5
        Questions.add("The number of leaf nodes in a rooted tree of n nodes, with each node having 0 or 3 children is:");
        Answers.add("(2n+1)/3");
        OptionA.add("n/2");
        OptionB.add("(n-1)/3");
        OptionC.add("(n-1)/2");
        OptionD.add("(2n+1)/3");
        //6
        Questions.add("What are the worst-case complexities of insertion and deletion of a key in a binary search tree?");
        Answers.add("?˜(n) for both insertion and deletion");
        OptionA.add("?˜(logn) for both insertion and deletion");
        OptionB.add("?˜(n) for both insertion and deletion");
        OptionC.add("?˜(n) for insertion and ?˜(logn) for deletion");
        OptionD.add("?˜(logn) for insertion and ?˜(n) for deletion");
        //7
        Questions.add("Let G be a simple graph with 20 vertices and 8 components. If we delete a vertex in G, then number of components in G should lie between ____.");
        Answers.add("7 and 19");
        OptionA.add("8 and 20");
        OptionB.add("8 and 19");
        OptionC.add("7 and 19");
        OptionD.add("7 and 20");
        //8
        Questions.add("Consider the following array of elements. ?89, 19, 50, 17, 12, 15, 2, 5, 7, 11, 6, 9, 100?. The minimum number of interchanges needed to convert it into a max-heap is");
        Answers.add("3");
        OptionA.add("4");
        OptionB.add("5");
        OptionC.add("2");
        OptionD.add("3");
        //9
        Questions.add("In an undirected connected planar graph G, there are eight vertices and five faces. The number of edges in G is _________.s");
        Answers.add("11");
        OptionA.add("10");
        OptionB.add("11");
        OptionC.add("12");
        OptionD.add("6");
        //10
        Questions.add("The recurrence relation capturing the optimal time of the Tower of Hanoi problem with n discs is");
        Answers.add("T(n) = 2T(n - 1) + 1");
        OptionA.add("T(n) = 2T(n - 2) + 2");
        OptionB.add("T(n) = 2T(n - 1) + n");
        OptionC.add("T(n) = 2T(n/2) + 1");
        OptionD.add("T(n) = 2T(n - 1) + 1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);

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
                        Intent intent = new Intent(DS_Activity.this, Result_DS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DS_Activity.this, Result_DS.class);
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
                        Intent intent = new Intent(DS_Activity.this, Result_DS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DS_Activity.this, Result_DS.class);
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
                        Intent intent = new Intent(DS_Activity.this, Result_DS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DS_Activity.this, Result_DS.class);
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
                        Intent intent = new Intent(DS_Activity.this, Result_DS.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(DS_Activity.this, Result_DS.class);
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
                Intent intent = new Intent(DS_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}