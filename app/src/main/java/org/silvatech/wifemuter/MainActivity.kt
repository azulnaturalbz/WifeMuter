package org.silvatech.wifemuter

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.ads.MobileAds;

class MainActivity : AppCompatActivity() {

    private lateinit var audio1: MediaPlayer
    private lateinit var audio2: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, "ca-app-pub-9497317358583649~7226564155")
        adView.loadAd(AdRequest.Builder().build())

        audio1 = MediaPlayer.create(this, R.raw.nice_quiet)

        audio2 = MediaPlayer.create(this, R.raw.naughty_quiet)

        val buttonNice = niceBtn

        val buttonNaughty = naughtyBtn



        buttonNice.setOnClickListener {
            if (audio2.isPlaying == true) {

            } else {
                audio1.start()
            }


        }

        buttonNaughty.setOnClickListener {
            if (audio1.isPlaying == true) {

            } else {
                audio2.start()
            }


        }
    }
}
