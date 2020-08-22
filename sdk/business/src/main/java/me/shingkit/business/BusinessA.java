package me.shingkit.business;

import me.shingkit.core.LogUtil;

public class BusinessA {
    public BusinessA(){

    }


    private static String TAG = "BusinessA";
    public void doSth(){
        LogUtil.INSTANCE.i(TAG, "doSth");
    }
}
