package com.example.lingxiangwang.myapplication;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by lingxiang.wang on 2015/6/29.
 */
public class MApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		LeakCanary.install(this);
	}
}
