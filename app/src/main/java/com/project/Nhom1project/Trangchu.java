package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Trangchu extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    View layout;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Manga> mangaList; private MangaAdapter mangaAdapter;
    ImageButton btnMenu;
    Button btnLogout;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState); setContentView(R.layout.activity_trangchu);
        mRecyclerView = findViewById(R.id.recyclerView);
        btnMenu=findViewById(R.id.btnMenu);
        layout=findViewById(R.id.master);
        btnLogout=findViewById(R.id.btnLogout);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        layout.bringToFront();
        layout.setVisibility(View.INVISIBLE);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mangaList = Manga.init();
        mangaAdapter = new MangaAdapter(Trangchu.this,R.layout.layout_item,mangaList);
        mRecyclerView.setAdapter(mangaAdapter);
        btnMenu.setOnClickListener(view -> {
            if (layout.getVisibility()==View.VISIBLE)
            layout.setVisibility(View.INVISIBLE);
            else

                layout.setVisibility(View.VISIBLE);
        });
        btnLogout.setOnClickListener(view -> {
            Intent intent = new Intent(Trangchu.this,Dangnhap.class);
            startActivity(intent);
        });
    }

}