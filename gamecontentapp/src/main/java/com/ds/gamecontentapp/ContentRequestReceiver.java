package com.ds.gamecontentapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by doosoon on 2017-12-04.
 */

public class ContentRequestReceiver extends BroadcastReceiver {
    private static final String TAG = "ContentRequestReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Received broadcast intent: " + intent.getAction());
    }
}
