package com.project.Nhom1project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {
    ImageView imgView;
    TextView txtView;
    Button btnPrev;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        txtView = findViewById(R.id.txtView);
        imgView = findViewById(R.id.imgView);
        String id = getIntent().getStringExtra("name");
        int idR = getIntent().getIntExtra("Id",R.drawable.attackontitan);
        txtView.setText(id);
        imgView.setImageResource(idR);
        btnPrev = findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(view -> {
            Intent intent = new Intent(DetailActivity.this,Trangchu.class);
            startActivity(intent);
        });
    }
}
