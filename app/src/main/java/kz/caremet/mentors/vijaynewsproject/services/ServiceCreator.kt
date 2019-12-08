package kz.caremet.mentors.vijaynewsproject.services

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {

    val baseUrl = "https://newsapi.org/"

    inline fun <reified T> createService(): T?{

        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(OkHttpClientInstance.getInstance())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync()).build()

        return retrofit.create(T::class.java)

    }


}