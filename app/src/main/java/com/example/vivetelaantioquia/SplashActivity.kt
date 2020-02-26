package com.example.vivetelaantioquia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.example.vivetelaantioquia.main.view.MainActivity
import java.util.*
import kotlin.concurrent.schedule


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashActivity : AppCompatActivity() {

    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        var toggle: LottieAnimationView  = findViewById(R.id.lav_toggle)
        toggle.playAnimation()
        Timer("SettingUp", false).schedule(3000) {

           var intent = Intent(context,
               MainActivity::class.java)
                startActivity(intent)


            finish()
        }





    }




}
