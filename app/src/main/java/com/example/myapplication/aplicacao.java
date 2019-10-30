package com.example.myapplication;

import android.app.Application;

import io.realm.Realm;

public class aplicacao extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        //Realm.deleteRealm(Realm.getDefaultConfiguration());
    }

}
