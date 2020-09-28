package com.example.myapplication

object Registration {

    fun validateRegistration(
        username: String,
        password: String,
        confirmation: String
    ): Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(password != confirmation) {
            return false
        }
        return true
    }

}