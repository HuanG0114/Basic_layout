package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Search_page extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//隱藏標題列
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.search_btn);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.home_btn:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return  true;

                    case R.id.book_btn:
                        startActivity(new Intent(getApplicationContext(),Publish_page.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.search_btn:
                        return true;

                    case R.id.notify_btn:
                        startActivity(new Intent(getApplicationContext(), notification_page.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.My_btn:
                        startActivity(new Intent(getApplicationContext(), My_page.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

    }

}
