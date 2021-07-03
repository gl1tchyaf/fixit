package com.techrz.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText email;
    EditText password;
    EditText repassword;
    EditText phonenumber;
    private Button submit;
    TextView errorfirstname;
    TextView errorlastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        repassword=findViewById(R.id.passwordre);
        phonenumber=findViewById(R.id.phonenumber);

        submit=findViewById(R.id.submitreg);

        errorfirstname= findViewById(R.id.error1);
        errorlastname= findViewById(R.id.error2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstname.getText().toString().equals("")) errorfirstname.setText("First name can not be Empty");
                if(!firstname.getText().toString().equals("")) errorfirstname.setText(" "); //sent to database

                if(lastname.getText().toString().equals("")) errorlastname.setText("Last name can not be Empty");
                if(!lastname.getText().toString().equals("")) errorlastname.setText(" "); //sent to database

                }

        });
    }
}