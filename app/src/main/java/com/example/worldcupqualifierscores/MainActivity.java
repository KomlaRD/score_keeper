package com.example.worldcupqualifierscores;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    //Tracks scores for Team A
    int scoreGhana = 0;

    // Tracks scores for Team B
    int scoreNigeria = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForGhana(0);
        displayForNigeria(0);
    }

    /**
     * Displays the given score for Team A.
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
     * This method is called when the number of ghana shots button is clicked
     */
    public void numberOfShots(View view) {
        scoreGhana = scoreGhana + 1;
        displayForGhana(scoreGhana);
    }

    /**
     * This method is called when the free throw button is clicked
     */
    public void numberOfFouls(View view) {
        scoreGhana = scoreGhana + 1;
        displayForGhana(scoreGhana);
    }

    /**
     * Displays the given score for Nigeria.
     */
    public void displayForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 button is clicked
     */
    public void nigeriaGoal(View view) {
        scoreNigeria = scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }


    /**
     * This method is called when the nigeria fouls button is clicked
     */
    public void nigeriaFouls(View view) {
        scoreNigeria = scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }

    /**
     * This method is called when the nigeria sgots on target button is clicked
     */
    public void nigeriaShotsOnTarget(View view) {
        scoreNigeria= scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }

    /**
     * This method is called when the reset button is clicked
     */
    public void resetButton(View view) {
        scoreGhana = 0;
        scoreNigeria = 0;
        displayForGhana(scoreGhana);
        displayForNigeria(scoreNigeria);
    }



}
