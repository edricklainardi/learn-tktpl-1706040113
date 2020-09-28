package com.example.myapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationTest {

    @Test
    fun empty_username() {
        val result = Registration.validateRegistration(
            username = "",
            password = "123",
            confirmation = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun empty_password() {
        val result = Registration.validateRegistration(
            username = "Hello",
            password = "",
            confirmation = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun wrong_confirmation() {
        val result = Registration.validateRegistration(
            username = "Hello",
            password = "123",
            confirmation = "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun correct_input() {
        val result = Registration.validateRegistration(
            username = "Hello",
            password = "123",
            confirmation = "123"
        )
        assertThat(result).isTrue()
    }
}