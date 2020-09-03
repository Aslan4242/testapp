package com.noxx.testapplication.test

import android.content.Context
import android.support.test.InstrumentationRegistry
import com.noxx.testapplication.application.AbstractApplication
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before

open class AbstractApplicationTest <T : AbstractApplication>(val app: T) {


}