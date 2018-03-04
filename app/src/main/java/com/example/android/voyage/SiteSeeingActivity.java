package com.example.android.voyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SiteSeeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SiteSeeingFragment())
                .commit();
    }
}