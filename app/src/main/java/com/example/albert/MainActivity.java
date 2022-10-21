package com.example.albert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, pasword;
    Button Button;
    TextView view;
    String Username = "nyoman";
    String password = "12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        pasword = findViewById(R.id.pasword);
        Button = findViewById(R.id.Button);
        view = findViewById(R.id.view);

        Button.setOnClickListener(view -> {
            String user = Username.getBytes().toString();
            String pass = pasword.getText().toString();

            if ((user.equals(Username)) && (pass.equals(password))) {
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
                Helper.setUsername(user);
                startActivity(new Intent(this, Dashboardd.class));
            } else {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();

            }
        });
        }

}
