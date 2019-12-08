package kz.caremet.mentors.vijaynewsproject.services

import io.reactivex.Single
import kz.caremet.mentors.vijaynewsproject.models.Feed
import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface NewsService {

    @GET("v2/everything?sortBy=popularity&q=sport&pageSize=100")
    fun getPopularNews(@Query("apiKey") apiKey: String): Single<Feed>

    @GET("v2/top-headlines?country=us&category=sports&pageSize=100")
    fun getTopNews(@Query("apiKey") apiKey: String): Single<Feed>

    @GET("v2/everything?sortBy=relevance&q=sport&pageSize=100")
    fun getSportNews(@Query("apiKey") apiKey: String): Single<Feed>


}
