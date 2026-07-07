package com.example.comlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform