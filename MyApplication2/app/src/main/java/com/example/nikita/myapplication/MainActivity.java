package com.example.nikita.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    private  TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate Activity");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy Activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop Activity");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart Activity");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause Activity");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume Activity");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart Activity");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState Activity");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState Activity");
    }

    public void OnClicMain(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
