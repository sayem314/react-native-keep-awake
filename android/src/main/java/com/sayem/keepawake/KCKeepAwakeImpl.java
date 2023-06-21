package com.sayem.keepawake;

import android.app.Activity;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;

class KCKeepAwakeImpl {

    public static final String NAME = "ReactNativeKCKeepAwake";

    static ReactApplicationContext RCTContext;

    public KCKeepAwakeImpl(ReactApplicationContext reactContext) {
        RCTContext = reactContext;
    }

    public void activate() {
        final Activity activity = RCTContext.getCurrentActivity();

        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                }
            });
        }
    }

    public void deactivate() {
        final Activity activity = RCTContext.getCurrentActivity();

        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    activity.getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                }
            });
        }
    }
}