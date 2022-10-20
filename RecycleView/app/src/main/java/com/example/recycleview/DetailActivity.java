package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvDetailC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvDetailC=findViewById(R.id.tvDetail);
        String id = getIntent().getStringExtra("userId");
        tvDetailC.setText(id);

    }
}