package com.example.nikita.myapplication;

import android.app.Application;
import android.util.Log;



public class MyApplication extends Application {

    private final static String TAG = "Application";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate Application");
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.d(TAG, "onLowMemory Application");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.d(TAG, "onTrimMemory Application");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "onCreate Application");
    }


}
