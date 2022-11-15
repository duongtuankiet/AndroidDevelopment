package com.project.Nhom1project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MangaReader extends AppCompatActivity {
    ImageView imageView;
    ImageButton imageButton;
    @SuppressLint("MissingInflatedId") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga_reader);
        imageButton =findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageManga);
        imageView.setImageResource(R.drawable.isekaiojisan_raw);
        imageButton.setOnClickListener(v -> {
            Intent i = new Intent(MangaReader.this,MainActivity.class);
            startActivity(i);
        });
    }
}