package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements MangaAdapter.UserCallback  {

    View layout;
    ImageButton btnMenu;
    DBHelper db;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHelper(this);
        setContentView(R.layout.activity_trangchu);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        btnMenu=findViewById(R.id.btnMenu);
        layout=findViewById(R.id.master);
        btnLogout=findViewById(R.id.btnLogout);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        layout.bringToFront();
        layout.setVisibility(View.INVISIBLE);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        ArrayList<Manga> mangaList = Manga.init();
        MangaAdapter mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
        mRecyclerView.setAdapter(mangaAdapter);
        for (Manga manga: mangaList) {
            db.insertManga(manga);
        }
        btnMenu.setOnClickListener(view -> {
            if (layout.getVisibility() == View.VISIBLE)
            layout.setVisibility(View.INVISIBLE);
            else
                layout.setVisibility(View.VISIBLE);
        });
        btnLogout.setOnClickListener(view -> {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        });
    }
    @Override
    public void onItemClick(int id,String name){
        Intent i= new Intent(this, DetailActivity.class);
        i.putExtra("Id",id);
        i.putExtra("name",name);
        startActivity(i);
    }

}