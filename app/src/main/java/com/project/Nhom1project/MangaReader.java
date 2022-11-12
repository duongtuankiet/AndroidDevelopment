package com.project.Nhom1project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

public class MangaReader extends AppCompatActivity {
    ImageView imageView;
    @SuppressLint("MissingInflatedId") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga_reader);
        imageView = findViewById(R.id.imageManga);
        int i = getIntent().getIntExtra("img",R.drawable.attackontitan);
        imageView.setImageResource(i);
    }
}