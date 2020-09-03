package com.noxx.testapplication.test

import android.support.test.runner.AndroidJUnit4
import com.noxx.testapplication.application.MKB
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MKBTest : AbstractApplicationTest<MKB>(MKB()) {

    @Test
    fun test() {
        app.open()
        app.clickOnLoginButton()
        app.checkWarningMessage("Необходимо ввести логин и пароль")
        app.clickOnOkButton()
        app.typeLogin("autotest")
        app.clickOnLoginButton()
        app.checkWarningMessage("Необходимо ввести логин и пароль")
        app.clickOnOkButton()
        app.typePassword("1")
        app.clickOnLoginButton()
        app.checkErrorMessage("Логин или пароль введен неверно")
        app.clickOnOkButton()
        app.typePassword("autotest")
        app.clickOnLoginButton()
        app.checkSuccessMessage("Успешный вход в приложение")
    }

}