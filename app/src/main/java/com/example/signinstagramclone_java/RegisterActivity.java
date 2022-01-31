package com.example.signinstagramclone_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class RegisterActivity extends AppCompatActivity {

    EditText fullNameReg, emailReg, passwordReg, confirmReg;
    Button btnReg;
    TextView textViewReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullNameReg = findViewById(R.id.full_name_reg);
        emailReg = findViewById(R.id.email_reg);
        passwordReg = findViewById(R.id.password_reg);
        confirmReg = findViewById(R.id.confirm_pass_reg);
        btnReg = findViewById(R.id.btn_reg);
        textViewReg = findViewById(R.id.sign_in_reg);

        btnReg.setOnClickListener(view -> {
            if (TextUtils.isEmpty(fullNameReg.getText()) || TextUtils.isEmpty(emailReg.getText())
                    || TextUtils.isEmpty(passwordReg.getText()) || TextUtils.isEmpty(confirmReg.getText())) {
                final Snackbar snackbar = Snackbar.make(view, "Please enter your info correctly!", Snackbar.LENGTH_LONG);
                snackbar.show();
            } else {
                openHomeActivity();
                finish();
            }
        });

    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}