package com.example.shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView statusTextView;
    Button readButton, writeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusTextView = findViewById(R.id.text_status);
        writeButton = findViewById(R.id.btn_write);
        readButton = findViewById(R.id.btn_read);

        String demoUsername = "marsBro";
        String demoEmail = "marsBro@gmail.com";

        SharedPreferences sharedPreferences = getSharedPreferences("user_preferences", MODE_PRIVATE);

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", demoUsername);
                editor.putString("email", demoEmail);
                editor.apply();
                statusTextView.setText("Data written successfully");
            }
        });

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = sharedPreferences.getString("username", "");
                String email = sharedPreferences.getString("email", "");
                statusTextView.setText("Username: " + username + "\nEmail: " + email);
            }
        });
    }
}
