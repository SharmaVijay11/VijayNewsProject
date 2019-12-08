package kz.caremet.mentors.vijaynewsproject.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.caremet.mentors.vijaynewsproject.R
import kz.caremet.mentors.vijaynewsproject.activities.main.MainActivity
import kz.caremet.mentors.vijaynewsproject.services.ServiceCreator

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        startActivity(Intent(this, MainActivity::class.java))
    }
}
