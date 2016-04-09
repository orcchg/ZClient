package com.orcchg.zclient;

import android.app.Application;

import timber.log.Timber;

public class ZClientApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
