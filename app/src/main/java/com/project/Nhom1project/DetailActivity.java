package com.project.Nhom1project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {
    ImageView imgView;
    ImageView imgFav;
    TextView txtView;
    Button btnPrev;
    Button btnFav;
    Button btnRead;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtView = findViewById(R.id.txtView);
        imgView = findViewById(R.id.imgView);
        imgFav = findViewById(R.id.imageFav);
        btnFav = findViewById(R.id.btnFav);
        btnRead= findViewById(R.id.btnRead);
        imgFav.bringToFront();
        imgFav.setVisibility(View.INVISIBLE);
        String id = getIntent().getStringExtra("name");
        int idR = getIntent().getIntExtra("Id",R.drawable.attackontitan);
        txtView.setText(id);
        imgView.setImageResource(idR);
        btnPrev = findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(view -> {
            Intent intent = new Intent(DetailActivity.this, MainActivity.class);
            startActivity(intent);
        });
        btnFav.setOnClickListener(view -> {
            if (imgFav.getVisibility() == View.VISIBLE)
                imgFav.setVisibility(View.INVISIBLE);
            else
                imgFav.setVisibility(View.VISIBLE);
        });
        btnRead.setOnClickListener(view ->{
            Intent i = new Intent(DetailActivity.this,MangaReader.class);
            i.putExtra("img",idR);
            startActivity(i);
        });

    }
}
