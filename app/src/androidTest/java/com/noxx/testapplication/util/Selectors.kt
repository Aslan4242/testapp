@file:JvmName("Selectors")

package com.noxx.testapplication.util


import android.support.annotation.IdRes
import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.*
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import java.util.concurrent.TimeUnit

private val timeout = 3000L

fun byRes(@IdRes resId: Int): BySelector = By.res(targetContext.resources.getResourceName(resId))


fun byPackage(packageName: String): BySelector = By.pkg(packageName)

fun byStringRes(resString: String): BySelector = By.res(getPackage(),resString)

fun byStringText(text: String): BySelector = By.text(text)



fun BySelector.waitFindObject(): UiObject2 =
    getDevice().wait(Until.findObject(this), timeout)

fun BySelector.getMessageValue() : UiObject2 {
  return  getDevice().wait(Until.findObject(this), timeout)

}

fun BySelector.waitHasObject(): Boolean =
    getDevice().wait(Until.hasObject(this), timeout)


