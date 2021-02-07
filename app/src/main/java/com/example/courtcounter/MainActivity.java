package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.courtcounter.R.id.team_a_score;
import static com.example.courtcounter.R.id.team_b_score;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointForA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }


    public void addTwoPointForA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }


    public void freeThrowForA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointForB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }


    public void addTwoPointForB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }


    public void freeThrowForB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}