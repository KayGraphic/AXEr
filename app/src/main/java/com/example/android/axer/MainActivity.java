package com.example.android.axer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.axer.R;


public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }


    /**
     * Displays score for Team A.
     */
    public void displayForTeamA(int scorea) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scorea));
    }

    public void buttonClutcha(View view) {
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);

    }

    public void button5pointsa(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);

    }

    public void button3pointsa(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void button1pointa(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays score for Team B.
     */
    public void displayForTeamB(int scoreb) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreb));
    }

    public void buttonClutchb(View view) {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);

    }

    public void button5pointsb(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);

    }

    public void button3pointsb(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void button1pointb(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * New Round
     */
    public void NewRound(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(0);
        displayForTeamA(0);


    }

}

