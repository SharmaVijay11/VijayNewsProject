package kz.caremet.mentors.vijaynewsproject.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kz.caremet.mentors.vijaynewsproject.R
import kz.caremet.mentors.vijaynewsproject.activities.main.fragments.FeedFragment
import kz.caremet.mentors.vijaynewsproject.activities.main.fragments.FragmentType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.mainFragmentContainer, FeedFragment.newInstance(FragmentType.TOP))
            .commit()


        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navMain -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.mainFragmentContainer, FeedFragment.newInstance(FragmentType.POPULAR))
                        .commit()
                }
                R.id.navTop -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.mainFragmentContainer, FeedFragment.newInstance(FragmentType.TOP))
                        .commit()
                }
                R.id.navNew -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.mainFragmentContainer, FeedFragment.newInstance(FragmentType.SPORT))
                        .commit()
                }

            }
            true
        }


    }
}
