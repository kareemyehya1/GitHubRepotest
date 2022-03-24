package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void calenderReview (View view){


        EditText drNameEditTxt = (EditText)  findViewById(R.id.editTextDrName);
        drNameEditTxt.getText();
        Log.i("Info", String.valueOf(drNameEditTxt.getText()));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}