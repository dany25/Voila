package com.voila.voila.voilapicopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AskQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        // Write the current number of steps in the activity
        TextView textViewSteps = (TextView) findViewById(R.id.textViewSteps);
        int currentSteps = ((MyVoilaApp) this.getApplication()).getSteps();
        textViewSteps.setText(currentSteps+" Steps");

        // Write the current temperature in the activity
        TextView textViewTemperature = (TextView) findViewById(R.id.textViewTemperature);
        int currentTemperature = ((MyVoilaApp) this.getApplication()).getTemperature();
        textViewTemperature.setText(currentTemperature+"°C");
    }

    /** Selection of the answer */
    public void selectAnswer1(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(1);
    }
    public void selectAnswer2(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(2);
    }
    public void selectAnswer3(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(3);
    }
    public void selectAnswer4(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(4);
    }
    public void selectAnswer5(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(5);
    }
    public void selectAnswer6(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(6);
    }
    public void selectAnswer7(View view) {
        ((MyVoilaApp) this.getApplication()).setAnswerSelected(7);
    }


    //The user waves his/her hand to answer the question after selecting the answer
    public void waveHand(View view) {
        int answerSelected = ((MyVoilaApp) this.getApplication()).getAnswerSelected();
        System.out.println("answerSelected: "+ answerSelected);

        Intent intentToMain = new Intent(this, MainActivity.class);
        startActivity(intentToMain);
    }

}
