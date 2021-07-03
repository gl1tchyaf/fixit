package com.techrz.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private String loginusername[]={"admin","fahim","hasib","rafiul"};
    private String loginpassword[]={"admin","fahim","hasib","rafiul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        Button login= findViewById(R.id.Login);
        Button signup= findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count=0;
                for(int i=0;i<loginusername.length;i++){
                    count++;
                    if(username.getText().toString().equals(loginusername[i]) && password.getText().toString().equals(loginpassword[i])){
                        logedin();
                        break;
                    }
                    else if(count==loginusername.length){
                        TextView t=findViewById(R.id.wrongInfo);
                        t.setText("Wrong username or Password");
                    }
                }

            }
        });

        signup.setOnClickListener(v->signup());
    }
    private void logedin(){
        Intent intent= new Intent(this,MainApp.class);
        startActivity(intent);
    }
    private void signup(){
        Intent intent= new Intent(this,signup.class);
        startActivity(intent);
    }

}