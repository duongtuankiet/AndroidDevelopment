package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements UserAdapter.UserCallback {
RecyclerView rvListC;
ArrayList<User> lstUser;
UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListC= findViewById(R.id.rvList);

        //
        LoadData();
        userAdapter= new UserAdapter(lstUser, this);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rvListC.setAdapter(userAdapter);
        rvListC.setLayoutManager(linearLayoutManager);
    }
    @Override
    public void onItemClick(String id){
        Intent i= new Intent(this, DetailActivity.class);
        i.putExtra("userId",id);
        startActivity(i);
    }
    void LoadData()
    {
        lstUser= new ArrayList<>();
        lstUser.add(new User("1","Phim1","alita.png"));
        lstUser.add(new User("2","Phim2","aquaman.png"));
        lstUser.add(new User("3","Phim3","bohemian.png"));
        lstUser.add(new User("4","Phim4","bumblebee.png"));
        lstUser.add(new User("5","Phim5","despicable.png"));
        lstUser.add(new User("6","Phim6","gatsby.png"));
        lstUser.add(new User("7","Phim7","girl.png"));
        lstUser.add(new User("8","Phim8","glass.png"));
        lstUser.add(new User("9","Phim9","happy.png"));
        lstUser.add(new User("10","Phim10","lalaland.png"));

    }
}