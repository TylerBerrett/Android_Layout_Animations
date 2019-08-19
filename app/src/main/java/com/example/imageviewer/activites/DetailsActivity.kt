package com.example.imageviewer.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.view.Window
import com.example.imageviewer.R
import com.example.imageviewer.model.ImageData
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Explode()
        window.exitTransition = Explode()

        setContentView(R.layout.activity_details)

        val location = intent.getSerializableExtra("key") as ImageData
        val imgUri = location.getUriPath()
        text_main.text = "Uri: ${location.uriToString}"
        img_main.setImageURI(imgUri)


    }
}
