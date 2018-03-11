package com.example.nikita.myapplication;

import android.content.Context;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;


public class MyViewGroup extends ViewGroup {


    int deviceWidth;
    private final static String TAG = "MainActivity";

    public MyViewGroup(Context context) {
        super(context,null,0);
        Log.d(TAG, "OnViewGoupFirst ViewGoup");
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
        Log.d(TAG, "OnViewGoupSecond ViewGoup");
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr ) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "OnViewGoupThird ViewGoup");
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {


    }

}
