package com.noxx.testapplication.application

import android.content.Intent

import com.noxx.testapplication.util.*



abstract class AbstractApplication(val packageName: String) {
    open fun open() {
        val intent = context.packageManager.getLaunchIntentForPackage(packageName).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        context.startActivity(intent)
        byPackage(packageName).waitHasObject()

    }
}