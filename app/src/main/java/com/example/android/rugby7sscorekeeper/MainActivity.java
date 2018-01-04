package com.example.android.rugby7sscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team Mafisi
    int scoreTeamMafisi = 0;

    // Tracks the score for Team Sponsor
    int scoreTeamSponsor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamMafisi(0);
    }

    /**
     * Increase the score for Team Mafisi by  2 points.
     */
    public void addTwoForTeamMafisi(View view) {
        scoreTeamMafisi = scoreTeamMafisi + 2;
        displayForTeamMafisi(scoreTeamMafisi);
    }

    /**
     * Increase the score for Team Mafisi by 3 points.
     */
    public void addThreeForTeamMafisi(View view) {
        scoreTeamMafisi = scoreTeamMafisi + 3;
        displayForTeamMafisi(scoreTeamMafisi);
    }

    /**
     * Increase the score for Team Mafisi by 3 points.
     */
    public void add3ForTeamMafisi(View view) {
        scoreTeamMafisi = scoreTeamMafisi + 3;
        displayForTeamMafisi(scoreTeamMafisi);
    }

    /**
     * Increase the score for Team Mafisi by 5 points.
     */
    public void addFiveForTeamMafisi(View view) {
        scoreTeamMafisi = scoreTeamMafisi + 5;
        displayForTeamMafisi(scoreTeamMafisi);
    }

    /**
     * Increase the score for Team Sponsor by 2 points.
     */
    public void addTwoForTeamSponsor(View view) {
        scoreTeamSponsor = scoreTeamSponsor + 2;
        displayForTeamSponsor(scoreTeamSponsor);
    }

    /**
     * Increase the score for Team Sponsor by 3 points.
     */
    public void addThreeForTeamSponsor(View view) {
        scoreTeamSponsor = scoreTeamSponsor + 3;
        displayForTeamSponsor(scoreTeamSponsor);
    }

    /**
     * Increase the score for Team Sponsor by 3 points.
     */
    public void add3ForTeamSponsor(View view) {
        scoreTeamSponsor = scoreTeamSponsor + 3;
        displayForTeamSponsor(scoreTeamSponsor);
    }

    /**
     * Increase the score for Team Sponsor by 5 points.
     */
    public void addFiveForTeamSponsor(View view) {
        scoreTeamSponsor = scoreTeamSponsor + 5;
        displayForTeamSponsor(scoreTeamSponsor);
    }

    /**
     * Reset the score for both teams to 0.
     */
    public void resetScore(View view) {
        scoreTeamMafisi = 0;
        scoreTeamSponsor = 0;
        displayForTeamMafisi(scoreTeamMafisi);
        displayForTeamSponsor(scoreTeamSponsor);
    }

    /**
     * Displays the given score for Team Fisi.
     */
    public void displayForTeamMafisi(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_mafisi_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Sponsor.
     */
    public void displayForTeamSponsor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_sponsor_score);
        scoreView.setText(String.valueOf(score));
    }
}