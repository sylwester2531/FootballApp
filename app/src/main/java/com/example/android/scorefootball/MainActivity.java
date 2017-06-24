package com.example.android.scorefootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int teamAyellow = 0;
    int teamAred = 0;
    int scoreTeamB = 0;
    int teamByellow = 0;
    int teamBred = 0;


    /**
     * Saves state
     */

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("sTa", scoreTeamA);
        outState.putInt("rTa", teamAred);
        outState.putInt("yTa", teamAyellow);
        outState.putInt("sTb", scoreTeamB);
        outState.putInt("rTb", teamBred);
        outState.putInt("yTb", teamByellow);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("sTa");
            teamAred = savedInstanceState.getInt("rTa");
            teamAyellow = savedInstanceState.getInt("yTa");
            scoreTeamB = savedInstanceState.getInt("sTb");
            teamBred = savedInstanceState.getInt("rTb");
            teamByellow = savedInstanceState.getInt("yTb");
            displayForTeamA(scoreTeamA);
            displayRedForTeamA(teamAred);
            displayYellowForTeamA(teamAyellow);
            displayForTeamB(scoreTeamB);
            displayRedForTeamB(teamBred);
            displayYellowForTeamB(teamByellow);

        }
    }

    /**
     * Adds 1 point to the given score for Team A.
     */
    public void PointForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Adds 1 red card to the given score for Team A.
     */
    public void RedCardForTeamA (View view) {
        teamAred = teamAred + 1;
        displayRedForTeamA(teamAred);
    }
    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedForTeamA(int score) {
        Button scoreView = (Button) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Adds 1 yellow card to the given score for Team A.
     */
    public void YellowCardForTeamA (View view) {
        teamAyellow = teamAyellow + 1;
        displayYellowForTeamA(teamAyellow);
    }
    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Adds 1 points to the given score for Team B.
     */
    public void PointForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Adds 1 red card to the given score for Team B.
     */
    public void RedCardForTeamB (View view) {
        teamBred = teamBred + 1;
        displayRedForTeamB(teamBred);
    }
    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Adds 1 yellow card to the given score for Team B.
     */
    public void YellowCardForTeamB (View view) {
        teamByellow = teamByellow + 1;
        displayYellowForTeamB(teamByellow);
    }
    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * reset score
     */
    public void resetScore (View view){
        scoreTeamA = 0;
        teamAyellow = 0;
        teamAred = 0;
        displayForTeamA(scoreTeamA);
        displayYellowForTeamA(teamAyellow);
        displayRedForTeamA(teamAred);
        scoreTeamB = 0;
        teamByellow = 0;
        teamBred = 0;
        displayForTeamB(scoreTeamB);
        displayYellowForTeamB(teamByellow);
        displayRedForTeamB(teamBred);
    }

}