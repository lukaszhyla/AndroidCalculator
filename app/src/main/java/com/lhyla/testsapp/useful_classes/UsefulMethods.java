package com.lhyla.testsapp.useful_classes;

import android.util.Log;

/**
 * Created by RENT on 2017-07-31.
 */

public class UsefulMethods {
    private static final String TAG = "LH";

    public static void printLOG(String LOG) {
        Log.d(TAG, LOG);
    }

    public static void threadSleep(int durationInMillis) {
        try {
            Thread.sleep(durationInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
