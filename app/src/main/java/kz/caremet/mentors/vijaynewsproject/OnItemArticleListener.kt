package kz.caremet.mentors.vijaynewsproject

import kz.caremet.mentors.vijaynewsproject.models.Article

interface OnItemArticleListener {
    fun startArticleDetailsActivity(article: Article)
}