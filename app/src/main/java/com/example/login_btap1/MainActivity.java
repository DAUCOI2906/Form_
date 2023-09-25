package com.example.login_btap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText username, pass;
    Button login;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.txtname);
        pass= findViewById(R.id.txtpass);
        login = findViewById(R.id.button);
        signup = findViewById(R.id.txtSignup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, hello_user.class);

                String user  = username.getText().toString();
                String password = pass.getText().toString();

                Bundle mybundle = new Bundle();

                mybundle.putString("username", user);
                mybundle.putString("password", password);

                myintent.putExtra("goi", mybundle);
                startActivity(myintent, mybundle);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent2 = new Intent(MainActivity.this,signup_activity.class);
                startActivity(myintent2);
            }
        });
    }
}