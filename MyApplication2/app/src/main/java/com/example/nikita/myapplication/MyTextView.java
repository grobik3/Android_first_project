package com.example.nikita.myapplication;


import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;

import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;


public class MyTextView extends TextView{

    final static String TAG = "View";
    public MyTextView(Context context) {
        super(context);
        Log.d(TAG, "FirstConstructor TextView");
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "SecondConstructor TextView");
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr ) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "ThirdConstructor TextView");
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log.d(TAG, "OnFinishInflate TextView");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "OnMeasure TextView");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "OnLayout TextView");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d(TAG, "OnChangeSize TextView");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "OnDraw TextView");
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "OnAttach TextView");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "OnDetach TextView");
    }
}
