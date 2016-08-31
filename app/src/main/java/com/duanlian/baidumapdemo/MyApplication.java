package com.duanlian.baidumapdemo;

import android.app.Application;
import com.baidu.mapapi.SDKInitializer;

/**
 * 初始化sdk
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
