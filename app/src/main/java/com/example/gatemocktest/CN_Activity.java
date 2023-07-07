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

public class CN_Activity extends AppCompatActivity {
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
        Questions.add("In Ethernet when Manchester encoding is used, the bit rate is:");
        Answers.add("Half the baud rate");
        OptionA.add("Half the baud rate");
        OptionB.add("Twice the baud rate");
        OptionC.add("Same as the baud rate");
        OptionD.add("None of the above");
        //2
        Questions.add("Suppose the round trip propagation delay for a 10 Mbps Ethernet having 48-bit jamming signal is 46.4 ms. The minimum frame size is");
        Answers.add("464");
        OptionA.add("94");
        OptionB.add("416");
        OptionC.add("464");
        OptionD.add("512");
        //3
        Questions.add("In serial data transmission, every byte of data is padded with a ‘0’ in the beginning and one or two ‘I’ s at the end of byte because");
        Answers.add("Receiver is to be synchronized for byte reception");
        OptionA.add("Receiver is to be synchronized for byte reception");
        OptionB.add("Receiver recovers lost ‘0’ and ‘1’s from these padded bits");
        OptionC.add("Padded bits are useful in parity computation");
        OptionD.add("None of these");
        //4
        Questions.add("Which one of the following statements is FALSE ?");
        Answers.add("Packet switching results in less variation in delay than circuit switching");
        OptionA.add("Packet switching leads to better utilization of bandwidth resources than circuit switching");
        OptionB.add("Packet switching results in less variation in delay than circuit switching");
        OptionC.add("Packet switching requires more per packet processing than circuit switching");
        OptionD.add("Packet switching can lead to reordering unlike in circuit switching");
        //5
        Questions.add("Which of the following statements is TRUE about CSMA/CD ?");
        Answers.add("CSMA/CD is not suitable for a high propagation delay network like satellite network");
        OptionA.add("IEEE 802.11 wireless LAN runs CSMA/CD protocol");
        OptionB.add("Ethernet is not based on CSMA/CD protocol");
        OptionC.add("CSMA/CD is not suitable for a high propagation delay network like satellite network");
        OptionD.add("There is no contention in a CSMA/CD network");
        //6
        Questions.add("Which of the following statements is FALSE regarding a bridge?");
        Answers.add("Bridge reduces broadcast domain");
        OptionA.add("Bridge is a layer 2 device");
        OptionB.add("Bridge reduces collision domain");
        OptionC.add("Bridge is used to connect two or more LAN segments");
        OptionD.add("Bridge reduces broadcast domain");
        //7
        Questions.add("Consider the following message M = 1010001101. The cyclic redundancy check (CRC) for this message using the divisor polynomial x^5 + x^4 + x^2 + 1 is :");
        Answers.add("01110");
        OptionA.add("01110");
        OptionB.add("01011");
        OptionC.add("10101");
        OptionD.add("10110");
        //8
        Questions.add("How many bytes of data can be sent in 15 seconds over a serial link with baud rate of 9600 in asynchronous mode with odd parity and two stop bits in the frame?");
        Answers.add("12,000 bytes");
        OptionA.add("10,000 bytes");
        OptionB.add("12,000 bytes");
        OptionC.add("15,000 bytes");
        OptionD.add("27,000 bytes");
        //9
        Questions.add("The minimum frame size required for a CSMA/CD based computer network running at 1 Gbps on a 200m cable with a link speed of 2 × 10^8m/s is");
        Answers.add("250 bytes");
        OptionA.add("125 bytes");
        OptionB.add("250 bytes");
        OptionC.add("500 bytes");
        OptionD.add("None of these");
        //10
        Questions.add("For which one of the following reasons does Internet Protocol (IP) use the time-to- live (TTL) field in the IP datagram header");
        Answers.add("Prevent packets from looping indefinitely");
        OptionA.add("Ensure packets reach destination within that time");
        OptionB.add("Discard packets that reach later than that time");
        OptionC.add("Prevent packets from looping indefinitely");
        OptionD.add("Limit the time for which a packet gets queued in intermediate routers");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn);

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
                        Intent intent = new Intent(CN_Activity.this, Result_CN.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CN_Activity.this, Result_CN.class);
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
                        Intent intent = new Intent(CN_Activity.this, Result_CN.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CN_Activity.this, Result_CN.class);
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
                        Intent intent = new Intent(CN_Activity.this, Result_CN.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CN_Activity.this, Result_CN.class);
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
                        Intent intent = new Intent(CN_Activity.this, Result_CN.class);
                        startActivity(intent);
                    }
                }
                else {
                    Intent intent = new Intent(CN_Activity.this, Result_CN.class);
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
                Intent intent = new Intent(CN_Activity.this, Result_EM.class);
                startActivity(intent);
            }
        }.start();
    }
}