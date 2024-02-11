package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;


public class LoginRegisterActivity extends AppCompatActivity {

    private EditText emailEdit;
    private EditText passwordEdit;

    private static final  String DEFAULT_EMAIL = "defuser@gmail.com";
    private static final  String DEFAULT_PASSWORD = "654321";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        Button registerButton = (Button) findViewById(R.id.registerButton);
        emailEdit = findViewById(R.id.Email);
        passwordEdit = findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if(email.equals(DEFAULT_EMAIL) && password.equals(DEFAULT_PASSWORD)){
                    startActivity(new Intent(LoginRegisterActivity.this,useract.class));
                }

                Toast.makeText(LoginRegisterActivity.this, "Login button is clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginRegisterActivity.this, RegisterActivity.class));
                finish();
            }
        });
    }
}