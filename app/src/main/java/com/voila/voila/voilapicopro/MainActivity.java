package com.voila.voila.voilapicopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** When BLE Sync is made */
    public void BLESync(View view) {
        TextView textViewSteps = (TextView) findViewById(R.id.textViewSteps);
        textViewSteps.setText("1234 Steps");
        TextView textViewTemperature = (TextView) findViewById(R.id.textViewTemperature);
        textViewTemperature.setText("27°C");
    }

    /** When Wake-Up */
    public void WakeUp(View view) {
        TextView textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewTitle.setText("Good Morning NAME!");
        TextView textViewQuestion= (TextView) findViewById(R.id.textViewQuestion);
        textViewQuestion.setText("How did you sleep?");
    }


}
