package com.demo.Controllers;

import com.demo.NativeScreens.SmartView;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class ViewManager extends SimpleViewManager<SmartView> {

    @Override
    public String getName() {
        return "Bulb";
    }

    @Override
    protected SmartView createViewInstance(ThemedReactContext reactContext) {

        return new SmartView(reactContext);

    }
}