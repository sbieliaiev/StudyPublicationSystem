package com.sbieliaiev.studypublicationsystem.core;

import android.app.Application;

import com.artlite.bslibrary.core.BSInstance;

/**
 *
 *  Class that provide application singleton for us
 */
public final class CurrentApplication extends Application {


    /**
     * Method wich provide the action when the application starts
     */
    @Override
    public void onCreate() {
        super.onCreate();
        BSInstance.init(this);
    }
}
