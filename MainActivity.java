package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int totalMark = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void option1A(View view) {
       totalMark = totalMark + 0;
    }

    public void option1B(View view) {
        totalMark = totalMark + 0;
    }

    public void option1C(View view) {
        totalMark = totalMark + 0;
    }

    public void option1D(View view) {
        totalMark = totalMark + 1;
    }

    public void option2A(View view) {
        totalMark = totalMark + 1;
    }

    public void option2B(View view) {
        totalMark = totalMark + 0;
    }

    public void option2C(View view) {
        totalMark = totalMark + 0;
    }

    public void option2D(View view) {
        totalMark = totalMark + 0;
    }

    public void option3A(View view) {
        totalMark = totalMark + 0;
    }

    public void option3B(View view) {
        totalMark = totalMark + 1;
    }

    public void option3C(View view) {
        totalMark = totalMark + 0;
    }

    public void option3D(View view) {
        totalMark = totalMark + 0;
    }

    public void option4A(View view) {
        totalMark = totalMark + 1;
    }

    public void option4B(View view) {
        totalMark = totalMark + 0;
    }

    public void option4C(View view) {
        totalMark = totalMark + 0;
    }

    public void option4D(View view) {
        totalMark = totalMark + 0;
    }

    public void option5A(View view) {
        totalMark = totalMark + 0;
    }

    public void option5B(View view) {
        totalMark = totalMark + 0;
    }

    public void option5C(View view) {
        totalMark = totalMark + 1;
    }

    public void option5D(View view) {
        totalMark = totalMark + 0;
    }

    public int getTotalMark() {
        return totalMark;
    }


    public void endTest(View view) {
        Toast.makeText(this, "Your score is " +  totalMark + "/5",  Toast.LENGTH_LONG).show();
        return;
    }

}