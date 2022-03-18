package com.example.worldcupqualifierscores;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    //Tracks scores for Ghana
    int scoreGhana = 0;

    // Tracks scores for Nigeria
    int scoreNigeria = 0;

    // Tracks fouls for Ghana
    int foulsGhana = 0;

    // Tracks fouls for Nigeria
    int foulsNigeria = 0;

    // Tracks shots on target for Ghana
    int shotsGhana = 0;

    // Tracks shots on target for Nigeria
    int shotsNigeria = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForGhana(0);
        displayForNigeria(0);
    }

    /**
     * Displays the given score for Ghana.
     */
    public void displayForGhana(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ghana_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the ghana goal button is clicked
     */
    public void onePoint(View view) {
        scoreGhana = scoreGhana + 1;
        displayForGhana(scoreGhana);
    }

    /**
     * Displays fouls for Ghana.
     */
    public void displayFoulsGhana(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ghana_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when fouls button for Ghana is clicked
     */
    public void numberOfFouls(View view) {
        foulsGhana = foulsGhana + 1;
        displayFoulsGhana(foulsGhana);
    }


    /**
     * Displays shots on target for Ghana.
     */
    public void displayShotsGhana(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ghana_shots);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when the number of ghana shots button is clicked
     */
    public void numberOfShots(View view) {
        shotsGhana = shotsGhana + 1;
        displayShotsGhana(shotsGhana);
    }




    /**
     * Displays the given score for Nigeria.
     */
    public void displayForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when the goal button for Nigeria is clicked
     */
    public void nigeriaGoal(View view) {
        scoreNigeria = scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }

    /**
     * Displays fouls for Nigeria.
     */
    public void displayFoulsNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_fouls);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when the nigeria fouls button is clicked
     */
    public void nigeriaFouls(View view) {
        foulsNigeria = foulsNigeria + 1;
        displayFoulsNigeria(foulsNigeria);
    }

    /**
     * Displays shots on target  for Nigeria.
     */
    public void displayShotsNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the nigeria shots on target button is clicked
     */
    public void nigeriaShotsOnTarget(View view) {
        shotsNigeria= shotsNigeria + 1;
        displayShotsNigeria(shotsNigeria);
    }

    /**
     * This method is called when the reset button is clicked
     */
    public void resetButton(View view) {
        scoreGhana = 0;
        scoreNigeria = 0;
        displayForGhana(scoreGhana);
        displayForNigeria(scoreNigeria);
        foulsGhana = 0;
        foulsNigeria = 0;
        displayFoulsGhana(foulsGhana);
        displayFoulsNigeria(foulsNigeria);
    }







}
