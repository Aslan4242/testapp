package com.noxx.testapplication.application

import com.noxx.testapplication.util.*
import org.junit.Assert

class MKB : AbstractApplication("com.noxx.testapplication") {

    fun clickOnLoginButton() {
        byStringText("ВОЙТИ").waitFindObject().click()
    }
    fun typeLogin(text: String) {
        byStringText("Логин").waitFindObject().text = text
    }
    fun typePassword(text: String) {
        byStringRes("etPassword").waitFindObject().text = text
    }

    fun checkWarningMessage(text: String) {
        Assert.assertEquals(
            text,
            byStringText("Необходимо ввести логин и пароль").getMessageValue().text
        )
    }
    fun checkErrorMessage(text: String) {
        Assert.assertEquals(
            text,
            byStringText("Логин или пароль введен неверно").getMessageValue().text
        )
    }
    fun checkSuccessMessage(text: String) {
        Assert.assertEquals(
            text,
            byStringText("Успешный вход в приложение").getMessageValue().text
        )
    }
    fun clickOnOkButton() {
        byStringText("ОК").waitFindObject().click()
    }
}