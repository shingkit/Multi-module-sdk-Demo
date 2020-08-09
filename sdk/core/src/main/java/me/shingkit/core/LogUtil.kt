package me.shingkit.core

import android.util.Log

object LogUtil {

    var DEBUG = true
    fun i(tag: String, msg: String) {
        if (DEBUG)
            Log.i(tag, msg)
    }

    fun e(tag: String, msg: String) {
        if (DEBUG)
            Log.e(tag, msg)
    }
}