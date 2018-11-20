package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team A by 3 points.
     */

    public void clickThree(View v) {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void clickFreeThrow(View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void clickTwo(View v) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void clickThreeB(View v) {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void clickFreeThrowB(View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void clickTwoB(View v) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}