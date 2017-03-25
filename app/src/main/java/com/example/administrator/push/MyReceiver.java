package com.example.administrator.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/3/25 0025.
 */

public class MyReceiver extends BroadcastReceiver{
    private static final String TAG = "MyReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        String title = bundle.getString(JPushInterface.EXTRA_TITLE);
        String msg = bundle.getString(JPushInterface.EXTRA_MESSAGE);
        Log.d(TAG, "onReceive: " + title + " " + msg);
    }
}
