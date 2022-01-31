package com.example.signinstagramclone_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    EditText emailLog, passwordLog;
    Button btnLogin;
    TextView sinUpLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailLog = findViewById(R.id.email_login);
        passwordLog = findViewById(R.id.password_login);
        btnLogin = findViewById(R.id.btn_login);
        sinUpLogin = findViewById(R.id.sign_up_login);

        btnLogin.setOnClickListener(view -> {
            if (TextUtils.isEmpty(emailLog.getText()) || TextUtils.isEmpty(passwordLog.getText())) {
                final Snackbar snackbar = Snackbar.make(view, "Please enter email and password!", Snackbar.LENGTH_LONG);
                snackbar.show();
            } else {
                openHomeActivity();
                finish();
            }
        });
        sinUpLogin.setOnClickListener(view -> {
            openRegActivity();
        });
    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openRegActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}