package com.project.Nhom1project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {
    ImageView imgView;
    ImageView imgFav;
    TextView txtView;
    TextView txtAuth;
    TextView txtProgress;
    TextView txtFav;
    TextView txtLike;
    TextView txtTitle;
    Button btnPrev;
    Button btnFav;
    Button btnRead;
    DBHelper db;
    Manga manga;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHelper(this);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        manga = new Manga(0,"",0, "","","",0,0);
        setContentView(R.layout.activity_detail);
        txtView = findViewById(R.id.txtView);
        txtAuth = findViewById(R.id.txtAuth);
        txtProgress=findViewById(R.id.txtProgress);
        txtFav=findViewById(R.id.txtFav);
        txtLike=findViewById(R.id.txtLike);
        txtTitle=findViewById(R.id.txtTitle);
        imgView = findViewById(R.id.imgView);
        imgFav = findViewById(R.id.imageFav);
        btnFav = findViewById(R.id.btnFav);
        btnRead= findViewById(R.id.btnRead);
        imgFav.bringToFront();
        String name = getIntent().getStringExtra("name");
        imgFav.setVisibility(View.INVISIBLE);
        manga = db.setInfo(name);
        txtAuth.setText(manga.getAuthor());
        txtLike.setText(""+ manga.getLike());
        txtFav.setText(""+manga.getFavourite());
        txtProgress.setText(manga.getProgress());
        txtTitle.setText(manga.getDescription());
        int idR = getIntent().getIntExtra("pic",R.drawable.attackontitan);
        txtView.setText(name);
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
