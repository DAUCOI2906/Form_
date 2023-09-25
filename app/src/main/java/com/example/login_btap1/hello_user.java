package com.example.login_btap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class hello_user extends AppCompatActivity {
    TextView txtuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_user);
        txtuser= findViewById(R.id.txtuser);

        Intent myintent = getIntent();

        Bundle mybundle = myintent.getBundleExtra("goi");
        String name = mybundle.getString("username");
        txtuser.setText("Hello "+name);
    }
}