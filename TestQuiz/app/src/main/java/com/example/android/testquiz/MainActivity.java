package com.example.android.testquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seeResult(View view) {

        CheckBox question1A = (CheckBox) findViewById(R.id.Question_1_A);
        boolean isRight = question1A.isChecked();

    }
}
