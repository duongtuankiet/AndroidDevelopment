package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements MangaAdapter.UserCallback  {

    View layout;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    TextView txtViewUsn;
    ImageButton btnSearch;
    ImageButton btnMenu;
    DBHelper db;
    Button btnLogout;
    ArrayList<Manga> mangaList;
    MangaAdapter mangaAdapter;
    EditText edtSearch;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHelper(this);
        setContentView(R.layout.activity_trangchu);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        btn1 = findViewById(R.id.action);
        btn2 = findViewById(R.id.adventure);
        btn3 = findViewById(R.id.comedy);
        btn4 = findViewById(R.id.romance);
        btn5 = findViewById(R.id.adult);
        txtViewUsn = findViewById(R.id.txtViewUsn);
        String uname = getIntent().getStringExtra("uname");
        txtViewUsn.setText(uname);
        btnSearch = findViewById(R.id.btnSearch);
        edtSearch =findViewById(R.id.edtSearch);
        btnMenu = findViewById(R.id.btnMenu);
        layout = findViewById(R.id.master);
        btnLogout=findViewById(R.id.btnLogout);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        layout.bringToFront();
        mangaList = db.exportManga();
        layout.setVisibility(View.INVISIBLE);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
        mRecyclerView.setAdapter(mangaAdapter);
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
        btn1.setOnClickListener(view ->{
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportRankedManga(1);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
        btn2.setOnClickListener(view ->{
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportRankedManga(2);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
        btn3.setOnClickListener(view ->{
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportRankedManga(3);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
        btn4.setOnClickListener(view ->{
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportRankedManga(4);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
        btn5.setOnClickListener(view ->{
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportRankedManga(5);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
        btnSearch.setOnClickListener(view ->{
            String named = edtSearch.getText().toString();
            layout.setVisibility(View.INVISIBLE);
            mangaList = db.exportSearchManga(named);
            mangaAdapter = new MangaAdapter(MainActivity.this, R.layout.layout_item, mangaList, this);
            mRecyclerView.setAdapter(mangaAdapter);
        });
    }
    @Override
    public void onItemClick(int id,int pic,String name){
        Intent i= new Intent(this, DetailActivity.class);
        i.putExtra("id",id);
        i.putExtra("pic",pic);
        i.putExtra("name",name);
        startActivity(i);
    }

}