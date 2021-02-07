package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Adds +3 to A score when a button is pressed.
     */
    public void addThreeA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Adds +2 to A score when a button is pressed.
     */
    public void addTwoA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Adds +1 to A score when a button is pressed.
     */
    public void addOneA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Adds +3 to B score when a button is pressed.
     */
    public void addThreeB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Adds +2 to B score when a button is pressed.
     */
    public void addTwoB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * Adds +1 to B score when a button is pressed.
     */
    public void addOneB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * Resets A and B scores.
     */
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}