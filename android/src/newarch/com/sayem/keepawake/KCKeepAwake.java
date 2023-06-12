package com.sayem.keepawake;

import android.os.Build;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;

import com.sayem.keepawake.NativeKCKeepAwakeSpec;

import android.util.Log;

public class KCKeepAwake extends NativeKCKeepAwakeSpec {

    private final KCKeepAwakeImpl delegate;

    public KCKeepAwake(ReactApplicationContext reactContext) {
        super(reactContext);
        delegate = new KCKeepAwakeImpl(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return KCKeepAwakeImpl.NAME;
    }
    
    @Override
    public void activate() {
        delegate.activate();
    }
    
    @Override
    public void deactivate() {
        delegate.deactivate();
    }
}