package com.demo.NativeScreens;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class SmartView extends Button {

    public SmartView(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setText("This button is created from JAVA code");
    }

    public SmartView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmartView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}