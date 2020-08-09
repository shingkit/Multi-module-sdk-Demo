package me.shingkit.core;

import android.content.Context;

public class AppGlobal {
    private Context context;

    private static volatile AppGlobal INSTANCE;
    private AppGlobal(){}

    private static class Holder{
        public static AppGlobal INSTANCE = new AppGlobal();
    }

    public static AppGlobal getInstance(){
        return Holder.INSTANCE;
    }

    public void init(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
