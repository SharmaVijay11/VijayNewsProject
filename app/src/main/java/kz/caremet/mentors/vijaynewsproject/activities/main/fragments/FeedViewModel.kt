package kz.caremet.mentors.vijaynewsproject.activities.main.fragments

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kz.caremet.mentors.vijaynewsproject.Constants
import kz.caremet.mentors.vijaynewsproject.models.Feed
import kz.caremet.mentors.vijaynewsproject.services.NewsService
import kz.caremet.mentors.vijaynewsproject.services.ServiceCreator

class FeedViewModel : ViewModel() {

    private val newsService = ServiceCreator.createService<NewsService>()

    fun getFeed(fragmentType: String): Single<Feed>? {
        when(fragmentType){
            FragmentType.POPULAR -> {
                return newsService?.getPopularNews(Constants.apiKey)?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())
            }
            FragmentType.SPORT -> {
                return newsService?.getSportNews(Constants.apiKey)?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())
            }
            else -> {
                return newsService?.getTopNews(Constants.apiKey)?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())
            }
        }
    }

}
