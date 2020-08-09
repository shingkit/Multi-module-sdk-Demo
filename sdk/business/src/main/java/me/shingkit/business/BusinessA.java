package me.shingkit.business;

import me.shingkit.core.AppGlobal;
import me.shingkit.core.LogUtil;

class BusinessA {

    private static String TAG = "BusinessA";
    public void doSth(){
        LogUtil.INSTANCE.i(TAG, "doSth");
    }
}
