package com.techrz.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= findViewById(R.id.gotologin);
        b.setOnClickListener(v -> login());
    }
    void login(){
        Intent intent= new Intent(this,LoginPage.class);
        startActivity(intent);
    }
}