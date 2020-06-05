package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0,foulA=0,foulB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnthreeA = findViewById(R.id.btnthreeA);
        Button btntwoA = findViewById(R.id.btntwoA);
        Button btnfreeA = findViewById(R.id.btnfreeA);
        Button btnfoulA = findViewById(R.id.btnfoulA);
        Button btnthreeB = findViewById(R.id.threeB);
        Button btntwoB= findViewById(R.id.twob);
        Button btnfreeB = findViewById(R.id.freeB);
        Button btnfoulB = findViewById(R.id.btnfoulB);
        Button btnreset = findViewById(R.id.reset);
        final TextView scrA = findViewById(R.id.scoreA);
        final TextView scrB = findViewById(R.id.scoreB);
        final TextView flA = findViewById(R.id.foulA);
        final TextView flB = findViewById(R.id.foulB);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrA.setText("0");
                scrB.setText("0");
                flA.setText("0");
                flB.setText("0");
            }
        });
        btnthreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA=scoreA+3;
                display(scoreA,foulA);
            }
        });
        btntwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA=scoreA+2;
                display(scoreA,foulA);
            }
        });
        btnfreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA=scoreA+1;
                display(scoreA,foulA);
            }
        });
        btnfoulA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foulA=foulA+1;
                display(scoreA,foulA);
            }
        });

        btnthreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB=scoreB+3;
                displayB(scoreB,foulB);
            }
        });
        btntwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB=scoreB+2;
                displayB(scoreB,foulB);

            }
        });
        btnfreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB=scoreB+1;
                displayB(scoreB,foulB);

            }
        });
        btnfoulB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foulB=foulB+1;
                displayB(scoreB,foulB);

            }
        });

    }
    private void display(int score,int foul) {

        TextView scrA=findViewById(R.id.scoreA);
        TextView flA=findViewById(R.id.foulA);
        scrA.setText(""+score);
        flA.setText(""+foul);
    }

    private void displayB(int score,int foul) {

        TextView scrB=findViewById(R.id.scoreB);
        TextView flB=findViewById(R.id.foulB);
        scrB.setText(""+score);
        flB.setText(""+foul);
    }


}
