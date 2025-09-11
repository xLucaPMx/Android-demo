package com.example.horoscapp.data.core.interceptors

import jakarta.inject.Inject
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request =
            chain.request().newBuilder().header("Authorization", tokenManager.getToken()).build()
        return chain.proceed(request)
    }
}

class TokenManager @Inject constructor() {
    fun getToken(): String = "MAYUNE"
}