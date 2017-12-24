package com.ds.mamegamelist;

import android.app.Application;
import android.util.Log;

/**
 * Created by doosoon on 2017-12-25.
 */

public class MGListApplication extends Application {

    public MGListApplication() {
        super();
        Log.d("CP_TEST", "Application: Constructor is called");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("CP_TEST", "Application: onCreate is called");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d("CP_TEST", "Application: onTerminate is called");
    }




}
