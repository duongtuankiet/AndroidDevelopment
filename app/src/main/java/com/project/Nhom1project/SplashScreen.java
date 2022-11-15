package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity{
    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, Login.class));
            finish();
        },700);

    }
}