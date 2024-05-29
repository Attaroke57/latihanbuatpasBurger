package com.example.latihanbuatpasburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);


                String username = settings.getString("username", "No Username Found");

                if (username.equalsIgnoreCase("No Username Found")){

                    Intent intent = new Intent(SplashScreen.this , MainActivity.class);
                    startActivity(intent);
                    finish();

                }else{

                    Intent intent = new Intent(SplashScreen.this , navigasi_burger.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);


    }
}