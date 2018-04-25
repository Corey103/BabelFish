package com.example.corey.androidstudioproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;


public class splashScreen extends AppCompatActivity {

    MediaPlayer introSound;


private int SLEEP_TIMER = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();


        introSound = MediaPlayer.create(splashScreen.this, R.raw.intro);
        introSound.start();

        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }
    //Make sound effect stop for splash screen
    @Override
    protected void onPause() {
        super.onPause();
        introSound.release();
        finish();
    }

    private class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(1000 * SLEEP_TIMER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(splashScreen.this, MainActivity.class);
            startActivity(intent);
            splashScreen.this.finish();

        }

    }

}


