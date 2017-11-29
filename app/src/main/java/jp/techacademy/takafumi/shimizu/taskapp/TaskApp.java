package jp.techacademy.takafumi.shimizu.taskapp;

/**
 * Created by tkfsm on 2017/11/28.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}