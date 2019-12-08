package kz.caremet.mentors.vijaynewsproject.activities.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_article.*
import kz.caremet.mentors.vijaynewsproject.R
import kz.caremet.mentors.vijaynewsproject.models.Article

class ArticleActivity : AppCompatActivity() {

    private var article: Article? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)


        article = intent.getSerializableExtra("article") as? Article

        article?.let {article ->
            newsTitle.text = article.title
            newsCreationDate.text = article.publishedAt
            descriptionTextView.text = article.content

            Glide.with(this)
                .load(article.urlToImage)
                .placeholder(R.drawable.ic_ball_load)
                .into(mainImage)
        }
    }
}
