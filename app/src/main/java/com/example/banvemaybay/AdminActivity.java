package com.example.banvemaybay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminActivity extends AppCompatActivity {
    Toolbar mToolBar;
    ImageView khImage,spImage,hdImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        khImage =  findViewById(R.id.btnKH);
        spImage =  findViewById(R.id.btnSP);
        hdImage =  findViewById(R.id.btnHD);
        mToolBar = (Toolbar) findViewById(R.id.toolbarSP);
        setSupportActionBar(mToolBar);
        khImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this,QLAccountActivity.class);
                startActivity(i);
            }
        });
        spImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, QLVeActivity.class);
                startActivity(i);
            }
        });
        hdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, QLHoaDonActivity.class);
                startActivity(i);
            }
        });
    }
}