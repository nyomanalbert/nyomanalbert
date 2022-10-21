package com.example.albert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboardd extends AppCompatActivity {

    TextView tvUsername;
    ImageView txtgambar1;
    ImageView txtgambar2;
    ImageView txtgambar3;
    ImageView txtgambar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardd);



        txtgambar1 = findViewById(R.id.m01);
        txtgambar2 = findViewById(R.id.m02);
        txtgambar3 = findViewById(R.id.m03);
        txtgambar4 = findViewById(R.id.m04);
        tvUsername = findViewById(R.id.username);
        tvUsername.setText(Helper.getUsername());



        txtgambar1.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    };
}