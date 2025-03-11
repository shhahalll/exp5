package com.example.exp5;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PasswordActivity extends AppCompatActivity {
    private TextView emailTextView;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        emailTextView = findViewById(R.id.emailTextView);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        String email = getIntent().getStringExtra("email");
        emailTextView.setText(email);
    }
}
