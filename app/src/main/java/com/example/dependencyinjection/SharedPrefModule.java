package com.example.dependencyinjection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefModule {
    Context mContext;



    public  SharedPrefModule(Context context){
        mContext = context;
    }

    @Singleton
    @Provides
    Context provideContext(){
        return mContext;
    }

    @Provides
    public SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(mContext);
    }
}