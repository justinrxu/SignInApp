package com.example.justinxu.signinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        System.out.println("Worked");

        final EditText siUsername = (EditText) findViewById(R.id.siUsername);
        final EditText siPassword = (EditText) findViewById(R.id.siPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = siUsername.getText().toString();
                final String password = siPassword.getText().toString();

                Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}
