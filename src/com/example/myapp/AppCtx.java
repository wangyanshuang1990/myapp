package com.example.myapp;

import android.app.Application;

/**
 * Created by 艳双 on 2016/1/7.
 * project:myapp
 * user:lisa[FR]
 * Date:2016/1/7
 */
public class AppCtx extends Application {
    private static AppCtx sAppCtx;
    private  String string;
    public static AppCtx getInstance() {
        return sAppCtx;
    }

}
