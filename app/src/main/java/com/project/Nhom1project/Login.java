package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    DBHelper db;
    Button btnLogin;
    TextView tv;
    Button btnRegister,btnForget;
    EditText edtUsn, edtPasswd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHelper(this);
        setContentView(R.layout.activity_login);
        tv = findViewById(R.id.txt);
        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);
        edtUsn = findViewById(R.id.edtUsername);
        edtPasswd = findViewById(R.id.edtPass);
        btnForget = findViewById(R.id.btnForget);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        View.OnClickListener listener = view -> {
            Intent i = new Intent(Login.this,Register.class);
            startActivity(i);
        };
        btnRegister.setOnClickListener(listener);
        @SuppressLint("SetTextI18n") View.OnClickListener listener2 = view -> {
            String uname = edtUsn.getText().toString();
            String upass = edtPasswd.getText().toString();
            if (edtUsn.getText().toString().equals(""))
            {
                tv.setText("Username not null!");
            }
            else
            if(db.getAccount(uname, upass))
            {
                String user = edtUsn.getText().toString();
                Intent i = new Intent(Login.this, MainActivity.class);
                i.putExtra("uname",user);
                startActivity(i);
            }
            else
            {
                tv.setText("Wrong username and password!");
            }
        };

        btnLogin.setOnClickListener(listener2);
        btnForget.setOnClickListener(view -> Toast.makeText(Login.this,"Sent email",Toast.LENGTH_LONG).show());

    }

}