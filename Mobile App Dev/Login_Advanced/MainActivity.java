package com.example.loginpageradiocheckbox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2;
    EditText et1, et2;
    TextView tv1, tv2;
    RadioButton rb1;
    CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et1.getText().toString();
                String pass = et2.getText().toString();
                if (user.equals("dalbin") && pass.equals("dalbin")) {
                    Toast.makeText(MainActivity.this, "logged in", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);

                // // Launch a browser to display a specified URL
                // Intent intent = new Intent(Intent.ACTION_VIEW);
                // intent.setData(Uri.parse("http://www.example.com"));
                // startActivity(intent);

                // // Dial a phone number
                // Intent intent = new Intent(Intent.ACTION_DIAL);
                // intent.setData(Uri.parse("tel:+123456789"));
                // startActivity(intent);

                // // Send an email
                // Intent intent = new Intent(Intent.ACTION_SENDTO);
                // intent.setData(Uri.parse("mailto:example@example.com"));
                // intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                // intent.putExtra(Intent.EXTRA_TEXT, "Email body");
                // startActivity(intent);

                // // Share text content with other apps
                // Intent intent = new Intent(Intent.ACTION_SEND);
                // intent.setType("text/plain");
                // intent.putExtra(Intent.EXTRA_TEXT, "This is the text to share.");
                // startActivity(Intent.createChooser(intent, "Share via"));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Radio button is checked", Toast.LENGTH_SHORT).show();
                } else if (cb1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Neither radio button nor checkbox is checked",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}