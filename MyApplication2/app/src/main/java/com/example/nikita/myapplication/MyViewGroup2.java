package com.example.nikita.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

public class MyViewGroup2 extends LinearLayout {

    private final static String TAG = "ViewGroup";

    public MyViewGroup2(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "FirstConstructor TextViewGroup");
    }

    public MyViewGroup2(Context context) {
        this(context, null);
        Log.d(TAG, "SecondConstructor TextViewGroup");
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log.d(TAG, "OnFinishInflate TextViewGroup");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "OnMeasure TextViewGroup");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "OnLayout TextViewGroup");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d(TAG, "OnChangeSize TextViewGroup");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "OnDraw TextViewGroup");
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "OnAttach TextViewGroup");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "OnDetach TextViewGroup");
    }

}
