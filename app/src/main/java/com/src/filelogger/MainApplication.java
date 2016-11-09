package com.src.filelogger;


import android.app.Application;

import timber.log.Timber;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
        Timber.plant(new FileLoggingTree());
    }
}
