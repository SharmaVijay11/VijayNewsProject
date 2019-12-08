package kz.caremet.mentors.vijaynewsproject.services

import android.content.Context
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object OkHttpClientInstance{

    var okHttpClient: OkHttpClient? = null

    fun getInstance(): OkHttpClient {
        if(okHttpClient == null){
            okHttpClient = createOkHttpClient()
        }
        return okHttpClient!!
    }



    fun createOkHttpClient(): OkHttpClient {

        val interceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Logger.api(message) })
        interceptor.level = HttpLoggingInterceptor.Level.BODY


        return okhttp3.OkHttpClient.Builder()
            .connectTimeout(60L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build()
    }



}