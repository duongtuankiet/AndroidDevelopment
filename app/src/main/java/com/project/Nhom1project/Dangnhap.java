package com.project.Nhom1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dangnhap extends AppCompatActivity {

    Button btnLogin;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRegister=findViewById(R.id.btnRegister);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dangnhap.this,Register.class);
                startActivity(i);
            }
        };

        btnRegister.setOnClickListener(listener);
    }
}