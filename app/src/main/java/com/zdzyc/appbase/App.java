package com.zdzyc.appbase;

import android.app.Application;
import android.content.Context;

/**
 * Created by zdzyc on 2016/1/26.
 */
public class App extends Application {

    private static final String DB_NAME = "zdzyc.db";
    public static Context sContext;


    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
