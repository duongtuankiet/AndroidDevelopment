package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MangaReader extends AppCompatActivity {
    ImageView imageView;
    ImageButton imageButton;
    Button prev;
    Button next;
    @SuppressLint("MissingInflatedId") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        setContentView(R.layout.activity_manga_reader);
        prev = findViewById(R.id.b1);
        next = findViewById(R.id.b3);
        prev.setOnClickListener(v-> Toast.makeText(MangaReader.this,"Tính năng đang phát triển",Toast.LENGTH_LONG).show());
        next.setOnClickListener(v-> Toast.makeText(MangaReader.this,"Tính năng đang phát triển",Toast.LENGTH_LONG).show());
        int img = getIntent().getIntExtra("img",R.drawable.logo);
        String s = getResources().getResourceEntryName(img);
        s = s+"_raw";
        int picid = getResources().getIdentifier(s,"drawable",getPackageName());
        imageButton =findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageManga);
        imageView.setImageResource(picid);
        imageButton.setOnClickListener(v -> {
            Intent i = new Intent(MangaReader.this,MainActivity.class);
            startActivity(i);
        });
    }
}