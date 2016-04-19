package com.orcchg.zclient;

import android.app.Application;

import com.orcchg.zclient.data.DataManager;
import com.orcchg.zclient.data.remote.RestAdapter;

import timber.log.Timber;

public class ZClientApplication extends Application {

    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        mDataManager = new DataManager(RestAdapter.Creator.create());
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
