package com.project.Nhom1project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button btnCancel,btnRegister;
    TextView txtView;
    EditText edtUsn,edtPass,edtRepass;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtView = findViewById(R.id.txtview2);
        btnCancel = findViewById(R.id.btnCancel);
        btnRegister=findViewById(R.id.btnRegister);
        edtPass =findViewById(R.id.edtPass);
        edtRepass =findViewById(R.id.edtRetype);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        edtUsn=findViewById(R.id.edtUsername);
       btnCancel.setOnClickListener(view -> {
           Intent i = new Intent(Register.this,Dangnhap.class);
           startActivity(i);
       }); //password at least eight characters long
        btnRegister.setOnClickListener(view -> {
            if(edtUsn==null)
            {
                txtView.setText("Username not null");
            }
            else if(edtPass.length()<8 && edtRepass.length()<8)
            {
                txtView.setText("Password at least eight characters long");
            }
            else if(!edtPass.getText().toString().equals(edtRepass.getText().toString()))
            {
                txtView.setText("Password didn't match");
            }
            else
            {

                Toast.makeText(Register.this,"Register successful",Toast.LENGTH_LONG).show();
                Intent i = new Intent(Register.this,Dangnhap.class);
                startActivity(i);
            }
        });

    }

}
