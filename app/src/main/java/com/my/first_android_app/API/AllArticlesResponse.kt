package com.my.first_android_app.API

data class AllArticlesResponse (
    val id: Int,
    val title: String,
    val content: String,
    val account_id: Int
)