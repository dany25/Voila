package com.voila.voila.voilapicopro;

import android.app.Application;

/**
 * Created by daniel on 26/11/2017.
 */

public class MyVoilaApp extends Application {

    private int presenceDetected  =0; // 0 if no human presence detected, 1 if detected
    private int steps = 0;
    private int temperature = 0;
    private int answerSelected = 0; // 0 if no question is asked, 1-7: according to the answer selected

    public int getPresence() {
        return presenceDetected;
    }

    public void setPresence(int presenceValue) {
        this.presenceDetected = presenceValue;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int stepsValue) {
        this.steps= stepsValue;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int TemperatureValue) {
        this.temperature= TemperatureValue;
    }

    public int getAnswerSelected() {
        return answerSelected;
    }

    public void setAnswerSelected(int answerValue) {
        this.answerSelected= answerValue;
    }
}
