package com.zqx.ankodemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
@SuppressLint("StaticFieldLeak")
public class ToastUtil {
    private static Toast toast;
    private static Context context = MyApp.context;

    public static void show(@StringRes int stringid) {
        show(context.getString(stringid));
    }

    @SuppressLint("ShowToast")
    public static void show(String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }

        toast.show();
    }

}
