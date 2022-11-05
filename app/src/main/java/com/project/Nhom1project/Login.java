package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    DBHelper db;
    Button btnLogin;
    Button btnRegister,btnForget;
    EditText edtUsn, edtPasswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHelper(this);
        setContentView(R.layout.activity_login);
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
        View.OnClickListener listener2 = view -> {
            String uname = edtUsn.getText().toString();
            String upass = edtPasswd.getText().toString();
            if (edtUsn.getText().toString().equals(""))
            {
                Toast.makeText(Login.this,"Username not null",Toast.LENGTH_LONG).show();

            }
            else
            if(db.getAccount(uname, upass))
            {
                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);
            }
            else
            {
                Toast.makeText(Login.this,"wrong :" +uname +" "+upass,Toast.LENGTH_LONG).show();
            }
        };

        btnLogin.setOnClickListener(listener2);
        btnForget.setOnClickListener(view -> Toast.makeText(Login.this,"Sent email",Toast.LENGTH_LONG).show());

    }

}