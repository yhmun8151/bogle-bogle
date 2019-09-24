package com.demo.Controllers;




import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CallNative extends ReactContextBaseJavaModule {
    private static Boolean isOn = false;
    public CallNative(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void getStatus(
            Callback successCallback) {
        successCallback.invoke(null, isOn);

    }

    @ReactMethod
    public void sendMassageToMain(String value) {
        System.out.println("sendMassageToMain is called : " + value);
    }

    @Override
    public String getName() {
        return "CallNative";
    }

}