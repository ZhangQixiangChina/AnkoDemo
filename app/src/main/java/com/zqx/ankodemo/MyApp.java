package com.zqx.ankodemo;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
@SuppressLint("StaticFieldLeak")
public class MyApp extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

}
