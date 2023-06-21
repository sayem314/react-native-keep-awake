// Adapted from
// https://github.com/gijoehosaphat/react-native-keep-screen-on

package com.sayem.keepawake;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class KCKeepAwake extends ReactContextBaseJavaModule {

    private final KCKeepAwakeImpl delegate;

    public KCKeepAwake(ReactApplicationContext reactContext) {
        super(reactContext);
        delegate = new KCKeepAwakeImpl(reactContext);
    }

    @Override
    public String getName() {
        return KCKeepAwakeImpl.NAME;
    }

    @ReactMethod
    public void activate() {
        delegate.activate();
    }

    @ReactMethod
    public void deactivate() {
        delegate.deactivate();
    }
}
